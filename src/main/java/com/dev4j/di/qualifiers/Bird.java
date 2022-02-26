/**
 * 
 */
package com.dev4j.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author mac
 *
 */
@Component
@Primary // Se especifica que esta implementaciòn sera la principal de la clase Animal
public class Bird extends Animal implements Volador {

	private static final Logger LOGGER = LoggerFactory.getLogger(Bird.class);

	public Bird(@Value("Pajaro loco") String nombre, @Value("21") Integer edad) {
		super(nombre, edad);
	}

	@Override
	public void volar() {
		LOGGER.info("I am bird and I am volando");
	}

}
