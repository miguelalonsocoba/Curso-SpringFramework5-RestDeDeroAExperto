/**
 * 
 */
package com.dev4j.di.inyection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author mac
 *
 */
@Component
public class Car {

	private String make;

	private Integer model;

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

	// Se agraga la inyeccion de dependencia a traves del metodo set.
	@Value("VW")
	public void setMake(String make) {
		this.make = make;
	}

	public Integer getModel() {
		return model;
	}

	// Se agraga la inyeccion de dependencia a traves del metodo set.
	@Value("1981")
	public void setModel(Integer model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	// Se agraga la inyeccion de dependencia a traves del metodo set.
	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", engine=" + engine + "]";
	}

}
