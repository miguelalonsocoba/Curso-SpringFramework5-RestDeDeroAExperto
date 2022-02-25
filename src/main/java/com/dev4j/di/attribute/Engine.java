/**
 * 
 */
package com.dev4j.di.attribute;

/**
 * @author mac
 *
 */
public class Engine {

	private String make;
	private Integer model;

	public Engine() {
	}

	public Engine(String make, Integer model) {
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
