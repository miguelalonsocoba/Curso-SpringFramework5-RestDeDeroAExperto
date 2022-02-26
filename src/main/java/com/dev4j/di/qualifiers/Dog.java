/**
 * 
 */
package com.dev4j.di.qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author mac
 *
 */
@Component
public class Dog extends Animal {

	public Dog(@Value("Rocky") String nombre, @Value("1") Integer edad) {
		super(nombre, edad);
	}

}
