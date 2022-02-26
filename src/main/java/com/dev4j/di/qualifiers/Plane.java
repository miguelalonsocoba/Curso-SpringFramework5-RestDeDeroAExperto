/**
 * 
 */
package com.dev4j.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author mac
 *
 */
@Component
public class Plane implements Volador {

	private static final Logger LOGGER = LoggerFactory.getLogger(Plane.class);
	@Override
	public void volar() {
		LOGGER.info("I am Plane and I am volando");
	}

}
