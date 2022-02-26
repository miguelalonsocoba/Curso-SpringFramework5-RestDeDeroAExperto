/**
 * 
 */
package com.dev4j.di.inyection;

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

	public Engine() {
	}

	public String getMake() {
		return make;
	}

	@Value("Xl1")
	public void setMake(String make) {
		this.make = make;
	}

	public Integer getModel() {
		return model;
	}

	@Value("1982")
	public void setModel(Integer model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Engine [make=" + make + ", model=" + model + "]";
	}

}
