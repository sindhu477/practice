package com.oop.practice;
//#15

//we are first performing changes using String buffer, not using String class
//as String buffer is fast and efficient in performance.
//later u can change the result to a string/immutable object.

public class StringExample {

	public static void main(String[] args) {
		
		StringBuffer buf = new StringBuffer("java");
		System.out.println(buf);
		
	//Append	
		buf.append(" Tiger v1/");
		buf.append(5);
		System.out.println(buf);
		
	//Set
		int index = 13;
		buf.setCharAt(index, '.'); //java tiger v1.5
		System.out.println(buf);

	//Insert
		//Insert and Append methods are not der in String class
		index = 5;
		buf.insert(index, "Developers "); //java Developers Tiger v1.5
		System.out.println(buf);
		
	//Replace
		int start = 25;
		int end = 26;
		buf.replace(start, end, "4"); //java Developers Tiger v1.4
		System.out.println(buf);
		
	//Delete
		start = 22;
		end = 23;
		buf.delete(start, end);
		System.out.println(buf); //java Developers Tiger 1.4
		
	//Convert to string after all changes are done
		String s = buf.toString();  //buf.tostring() is a method
		System.out.println(s);
		
	}

}
