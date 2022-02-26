/**
* 
*/
package com.dev4j.di.qualifiers;

/**
 * @author mac
 *
 */
public abstract class Animal {

	private String nombre;
	private Integer edad;

	public Animal(String nombre, Integer edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
