package com.oop.practice;
//#5
//Encapsulated class example-- best to be private, and an example for overloading too!
//getters and setters are used to operate.

public class box {
    private int width;
	private int lenght;
	private int breadth;
	
	/* right click-->source-->generate setters and getters-- needed to 
	 access the private variables created above.
	 all the below lines of code will be generated
	 get to read the value and return the value and set is to  
	 modify the value.*/
	
//	public box(int i, int j, int k) {
//		// TODO Auto-generated constructor stub
//		width = i;
//		lenght = j;
//		breadth = k;
//	}
	public box(int width, int lenght, int breadth) {  // observe this method and the constructor method below are both overloading
		// TODO Auto-generated constructor stub
		this.width = width;
		this.lenght = lenght;
		this.breadth = breadth;
		/*integer values which are getting passed will be passed to
		 * class variables using 'this' operator.
		 * this-->current class
		 * super --> super class */
	}
	public box() {
		// TODO Auto-generated constructor stub
		width = 0;
		lenght = 0;
		breadth = 0;
	}
	public int getWidth() {
		return width;   // as width is declared as type int, the method here is decalred with return type int.
	}
	public void setWidth(int width) {
		this.width = width;  //setting the value has no return type, so void return type.
	} //wont return anything-- just sets it.
	
	public int getLenght() { //getter methods-- accessor methods
		return lenght;
	}
	public void setLenght(int lenght) { // setter methods-- mutator methods
		this.lenght = lenght;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int calcVolume()  {  // Helper Methods
		return (width * lenght * breadth);
	}
	
	

}
