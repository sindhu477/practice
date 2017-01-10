package com.oop.practice;

public class ExceptionTest {
//#20
	public static void main(String[] args) {
		int array[] = {10,20,30,40,50};
		
		
		try {
		for(int i = 0; i<= array.length; i++){ //'<=' gives runtime exception.
			System.out.println(array[i]);
		}
		} catch (ArrayIndexOutOfBoundsException ex) {
			//System.out.println(ex.getMessage()); -->try this too--predefined message.
			System.out.println("Array Index out of bounds is not accessible");  //-->user friendly message.
		}
		
		System.out.println("ThankYou");
		// If the exception wasn't handled, this 'thankyou' message wouldn't have printed.
		// exception if not handled will terminate the program where ever it is occurred.
	}

}
