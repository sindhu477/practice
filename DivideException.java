package com.oop.practice;
//#18
public class DivideException {

	public static void main(String[] args) {
		division (100, 4); //Line 1
		division (100, 0); //Line 2
		System.out.println("Exit main().");
		

	}

	public static void division(int totalSum, int totalNumber) {
		System.out.println("Computing Division");
		try {
		int average = totalSum / totalNumber;
		System.out.println("Average: " + average);
		} catch (ArithmeticException ex) {
			System.out.println("Divided by Zero exception occurred");
		}
	}

}
