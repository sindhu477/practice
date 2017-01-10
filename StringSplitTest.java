package com.oop.practice;
//#16

public class StringSplitTest {

	public static void main(String[] args) {
		String str = "I think I am so pretty";
		
		System.out.println("String: " + str);
		
//split method is provided by string class
		String[] splitArray = str.split("\\s"); // '\\s' ==> should be split at space
		System.out.println("Split Array Length: " + splitArray.length);
		for (String s : splitArray) {
			System.out.println(s);
		}
	}

}
