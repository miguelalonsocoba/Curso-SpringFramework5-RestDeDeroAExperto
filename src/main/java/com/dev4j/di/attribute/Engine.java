/**
 * 
 */
package com.dev4j.di.attribute;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author mac
 *
 */
@Component
public class Engine {

	private String make;

	private Integer model;

	public Engine(@Value("Xl1") String make, @Value("1982") Integer model) {
		super();
		this.make = make;
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public Integer getModel() {
		return model;
	}

	public void setModel(Integer model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Engine [make=" + make + ", model=" + model + "]";
	}

}
