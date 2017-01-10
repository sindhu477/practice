package com.oop.practice;

//#4

public class BikeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike Bike1 = new Bike(); //All methods and declarations from superclass can be used in subclasses.
		Bike1.ChangeColor("Red");
		Bike1.SpeedUp(70);
		Bike1.ChangeGear(4);
		System.out.println("Bike1 details");
		Bike1.PrintStates();
	}

}
