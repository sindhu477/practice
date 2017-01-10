package com.oop.practice;  // Example for static Block test
//#12
public class StaticBlock {
	
	static{
		System.out.println("hi");
	} // this static block will be executed once no matter what.
	
	public void print() {
		System.out.println("Hello");
	}

 	public static void main(String[] args) {
		
	StaticBlock st1 = new StaticBlock();
	st1.print();
	StaticBlock st2 = new StaticBlock();
	st2.print();
		
	}

}
