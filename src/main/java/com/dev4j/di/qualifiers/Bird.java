/**
 * 
 */
package com.dev4j.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author mac
 *
 */
@Component("pajaro")// Se especifica el qualifier.
public class Bird extends Animal implements Volador{

	private static final Logger LOGGER = LoggerFactory.getLogger(Bird.class);
	
	public Bird(@Value("Pajaro loco") String nombre, @Value("21") Integer edad) {
		super(nombre, edad);
	}
	
	@Override
	public void volar() {
		LOGGER.info("I am bird and I am volando");
	}

}
