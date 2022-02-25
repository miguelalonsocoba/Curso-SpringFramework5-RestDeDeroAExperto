package com.dev4j.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dev4j.di.attribute.Car;
import com.dev4j.di.attribute.Engine;

@SpringBootApplication
public class DependencyInyectionApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DependencyInyectionApplication.class, args);

		Engine engine = new Engine("Xl1", 1981);
		Car car = new Car("Tsuru", 1985, engine);

		System.out.println(car);
	}

}
