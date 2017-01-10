//#7
package com.oop.practice; //Example for Abstraction-->abstract methods are those which are not implemented-->will be implemented in subclasses.
//creating a shape class as base class to calculate area for different shapes

public abstract class Shape { 
	// when one method of a class is made abstract, that class should be made abstract too.
	//here shape class is abstract and rectangle,circle classes are concrete classes which are extending abstract  class.
	
	abstract double calculateArea(); 
	
	/* {return 0.0 -- returning 0.0 as area of which shape is to be calculated is unknown
	 *  }*/
	
	// as the body of this method is not necessary, we are removing its 
	//body and making this method abstract--> remove body, eclipse will provide fixes to make it abstract.
	
	void print() {
		System.out.println("This is abstract shape"); 
		// An abstract class can have no abstract methods too (unlike interfaces)
		// If this method is overriden in subclass then that method will be executed, else this method ll be executed.
		//check shapetest for this
	}

}
