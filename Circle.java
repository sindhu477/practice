//#9
package com.oop.practice; //example for abstraction

public class Circle extends Shape {
	
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override   // '@' is annotation
	double calculateArea() {
		return (3.142 * radius * radius);
	}

}
