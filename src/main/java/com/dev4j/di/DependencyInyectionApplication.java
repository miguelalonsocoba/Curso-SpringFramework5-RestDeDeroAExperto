package com.dev4j.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dev4j.di.attribute.Car;

@SpringBootApplication
public class DependencyInyectionApplication {

	public static void main(String[] args) {
		// El contexto es el lugar donde viven los objetos administrados por Spring.
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);

		// Se recupera el bean/Objeto del contexto de Spring.
		Car car = context.getBean(Car.class);

		System.out.println(car);
	}

}
