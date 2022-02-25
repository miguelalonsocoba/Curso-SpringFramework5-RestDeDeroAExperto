/**
 * 
 */
package com.dev4j.di.attribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author mac
 *
 */
@Component
public class Car {

	@Value("VW")
	private String make;

	@Value("1981")
	private Integer model;

	// Se realiza la inyeccion de dependencia en un atributo.
	@Autowired
	private Engine engine;

	public Car() {

	}

	public Car(String make, Integer model, Engine engine) {
		super();
		this.make = make;
		this.model = model;
		this.engine = engine;
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

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", engine=" + engine + "]";
	}

}
