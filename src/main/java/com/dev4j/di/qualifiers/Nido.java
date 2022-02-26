/**
 * 
 */
package com.dev4j.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author mac
 *
 */
@Component
public class Nido {

	private static final Logger LOGGER = LoggerFactory.getLogger(Nido.class);

	@Autowired // No es necesario usar el qualifier ya que se agrego a la implementacion de
				// Bird la etiqueta de Primary.
	private Animal animal;

	public void print() {
		LOGGER.info("Mi nido tiene al animal: {}", animal.getNombre());
	}
}
