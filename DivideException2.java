package com.oop.practice;
//#19

public class DivideException2 {

	public static void main(String[] args) {
		int result = divisionon (100, 0);
		System.out.println("Result: " + result);

	}

	public static int divisionon(int totalsum, int totalnumber) {
		int quotient =0;
		System.out.println("computing division");
		
		try{
			quotient  =totalsum/totalnumber;
		} catch (Exception e){
			System.out.println("Exception: " + e.getMessage() ); // 'e' is exception object, and getmessage is the method used to get/show message 
		
		} finally {
			if (quotient != 0)  {
				System.out.println("Finally block executed");
			} else {
				
				System.out.println("Finally block executed, but Exception occurred" );
			}
		}
		return quotient;
	}

}
