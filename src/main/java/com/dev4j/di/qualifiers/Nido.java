/**
 * 
 */
package com.dev4j.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author mac
 *
 */
@Component
public class Nido {

	private static final Logger LOGGER = LoggerFactory.getLogger(Nido.class);

	@Autowired
	@Qualifier("pajaro")
	private Animal pajaro;

	public void print() {
		LOGGER.info("Mi nido tiene al animal: {}", pajaro.getNombre());
	}
}
