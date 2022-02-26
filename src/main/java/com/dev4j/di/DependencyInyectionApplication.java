package com.dev4j.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DependencyInyectionApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(DependencyInyectionApplication.class);

	// Representa la declaracion de Bean de forma explicita.
	@Bean
	public String getApplicationName() {
		return "Devs4j_rules";
	}

	public static void main(String[] args) {
		// El contexto es el lugar donde viven los objetos administrados por Spring.
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
		String nameApplication = context.getBean(String.class);
		LOGGER.info("Name application: {}", nameApplication);
	}

}
