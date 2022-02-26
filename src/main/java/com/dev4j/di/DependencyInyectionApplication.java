package com.dev4j.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dev4j.di.scopes.ExampleScopeService;

@SpringBootApplication
public class DependencyInyectionApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(DependencyInyectionApplication.class);

	public static void main(String[] args) {
		// El contexto es el lugar donde viven los objetos administrados por Spring.
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
		ExampleScopeService exampleScopeService = context.getBean(ExampleScopeService.class);
		ExampleScopeService exampleScopeService1 = context.getBean(ExampleScopeService.class);
		
		LOGGER.info("Are beans equals {}", exampleScopeService.equals(exampleScopeService1));
		LOGGER.info("Are beans == {}", exampleScopeService == exampleScopeService1);
	}

}
