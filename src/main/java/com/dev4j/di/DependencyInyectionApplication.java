package com.dev4j.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dev4j.di.qualifiers.Nido;

@SpringBootApplication
public class DependencyInyectionApplication {

//	private static final Logger LOGGER = LoggerFactory.getLogger(DependencyInyectionApplication.class);

	public static void main(String[] args) {
		// El contexto es el lugar donde viven los objetos administrados por Spring.
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);

		// Se recupera el bean/Objeto del contexto de Spring.
//		Animal animal = context.getBean("bird", Animal.class); // Se pasa como parametro el Qualifier de la clase y el tipo de clase.
//		LOGGER.info("Animal name: {}, age: {}", animal.getNombre(), animal.getEdad());

		Nido nido = context.getBean(Nido.class);
		nido.print();
	}

}
