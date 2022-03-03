/**
 * 
 */
package com.dev4j.di.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author mac
 *
 */
@Component
public class Square implements Figure {

	@Value("${square.side:0}")
	private double side;

	@Override
	public double calculateArea() {
		return side * side;
	}

}
