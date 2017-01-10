package com.oop.practice;
//#11
abstract class A {
	A() {    //--->A() is a constructor calling abstract method m().
		
		m();
		
	}
	public abstract void m();
	
}

class B extends A { // here an implicit super(); method will be instantiated as B is extending A
	B() {
		m();
	}
	private int i = 1;
	public void m() {
		System.out.println(i);
	}
}

public class AB {

	public static void main(String[] args) {
		
		A obj1 = new B();  
		// cannot instantiate class A as its an abstract class. So we are instantiating class B
		//with object reference to A
		// So obj1 is super class variable referring to the object to class B.
		
		//look at the output, its 0,1 (not 1), because as B is extending A, first m() from class A will 
		//be invoked and then goes to B'm(). m() is not instantiated in A--> so prints 0 and then 1 from B.
		
		
	}

}
