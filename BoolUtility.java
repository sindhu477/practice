package com.oop.practice;
//#21
public class BoolUtility {
	
	public static final boolean StringtoBoolean(String str) {
		if (str.equals("0")) return false;  //equals is a method of string class
		
		str = str.toLowerCase();  //toLowerCase is a method of string class
		if (str.equals("false")) return  false;
		if (str.equals("no")) return false;
		
		//if its non false, its true by definition
		return true;
		
	} // End of stringtoboolean

	public static void main(String[] args) {
		if (args.length > 0) {
			if (StringtoBoolean(args[0]))
				System.out.println(args[0] + " is TRUE");
			else
			    System.out.println(args[0] + " is FALSE");
				
		} else {
			System.out.println("Run the program with a bool to test ");
		}
		

	}//End of main

} //End of class
