package com.oop.practice; // Example for "Y static?"--purpose of having a static method
//#13

public class M {

	public static void main(String[] args) {
//		amethod(args);
		M obj = new M();
		obj.amethod(args); //we are instantiating using an object--> so here 'amethod' is considered as instance method.

	}
	
	//commented part is one way of programming, uncommented is other.
	//first we are trying to access arguments of main method from 'amethod' method and declared it as non static,
	// It gives u error saying its not static and thus cant access a static method directly and so we declared amethod as static.
	
	//second scenario--> if amethod is not static and if we have to use it to access static-->create a class object 
	//and call the method using the class object.
	//Hence static deals with class level and not static deals with object level.
	
//	public static void amethod(String[] args) {
	public void amethod(String[] args) {
		for(int i =0; i < args.length; i++){
			System.out.println(args[i]);
		}
	}
 
}
