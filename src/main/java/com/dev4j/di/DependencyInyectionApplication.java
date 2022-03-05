package com.dev4j.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.dev4j.di.lifecycle.ExplicitBean;
import com.dev4j.di.lifecycle.LifeCycleBean;

@SpringBootApplication
public class DependencyInyectionApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(DependencyInyectionApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
//		LifeCycleBean bean = context.getBean(LifeCycleBean.class);

	}

}
