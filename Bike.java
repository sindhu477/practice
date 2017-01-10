//3
package com.oop.practice;

//Example for inheritence

public class Bike extends vehicle { //inheriting superclass "vehicle"
	
	int seats = 1; //new initialization in sub class
	
	void ChangeColor(String newvalue) {  //new method initialization in subclass.
	super.color = newvalue; // "Super." is optional.
	}
}
