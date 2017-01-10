//#8
package com.oop.practice; //for abstraction 

public class Rectangle extends Shape {

	private double width; //according to encapsulation concept-->private
	private double length;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	
	
//		double calculateArea() {
//			return (width * length) ; if these lines of code are removed, we will get an error to 
// implement unimplemented methods--> i.e abstract methods of super class. click on implement unimplemented
// below lines of code will be generated.
//								}
	

	@Override
	
	double calculateArea() {
		// TODO Auto-generated method stub
		//return 0;  commented this-->we have to implement it.
		return (length * width);   //--> calculate area method is overridden by its subclass.
	}
	 void print(){
		 System.out.println("This is a rectangle shape");
	 }
	 
}
