

// 1 
package com.oop.practice;

//Example for creating a class and using in vehicletest.java using class objects
public class vehicle {

	int speed = 0;
	int gear = 1;
	String color = "black";
	
	void ChangeGear(int newValue) {
		gear = newValue;
	}
	
	void SpeedUp (int increment) {
		speed = speed + increment;
		
	}
	
	void ApplyBreaks (int decrement) {
		speed = speed - decrement;
	}
	
	
	void PrintStates() {
		System.out.println("Color: " + color );
		System.out.println("Speed: " + speed);
		System.out.println("Gear: " + gear);
	}

}
