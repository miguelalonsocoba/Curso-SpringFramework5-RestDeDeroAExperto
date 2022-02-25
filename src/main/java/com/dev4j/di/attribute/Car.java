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

	private String make;

	private Integer model;

	private Engine engine;

	// Se agraga la inyeccion de dependencia a nivel de constructor.
	@Autowired
	public Car(@Value("VW") String make, @Value("1981") Integer model, Engine engine) {
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
