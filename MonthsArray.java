package com.oop.practice;
//#14
public class MonthsArray {

	public static void main(String[] args) {
		
		String[] months = {"jan", "feb", "march", "april"};

		System.out.println("size of arrray is: " + months.length);
//		for(int i=0; i<months.length; i++){
//			System.out.println(months[i]);
//			}
		
		for (String month : months){
			System.out.println(month); 	//enhanced for loop
		}
	
}
}
