//2

package com.oop.practice;

public class vehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		vehicle v = new vehicle(); // here its a construtor--with no arguments.
		
		v.PrintStates();
		
		vehicle bike1 = new vehicle();
		vehicle bike2 = new vehicle();
		
		bike1.SpeedUp (10);
		bike1.ChangeGear(2);
		System.out.println("Bike1 details as follows");
		bike1.PrintStates();
		System.out.println();
		
		
		bike2.SpeedUp (10);
		bike2.ChangeGear(2);
		bike2.SpeedUp (20);
		bike2.ChangeGear(3);
		System.out.println("Bike2 details as follows");
		bike2.PrintStates();
		System.out.println();
	}

}
