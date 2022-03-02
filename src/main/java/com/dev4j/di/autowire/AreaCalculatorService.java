/**
 * 
 */
package com.dev4j.di.autowire;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mac
 *
 */
@Service
public class AreaCalculatorService {

	@Autowired
	private List<Figure> figures;

	public double calAreas() {
		double area = 0;
		for (Figure figure : figures) {
			area += figure.calculateArea();
		}
		return area;
	}
}
