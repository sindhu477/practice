package com.oop.practice;
//#6
public class boxtest {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		box b = new box();
	    b.setWidth(10);
	    b.setLenght(12);
	    b.setBreadth(8);
	    
	    
	    /*Initially we created an object b and tried to set values
	     * using source generated setter methods.
	     * Now we created another object b2 with parameters/arguments passed
	     * as u can see below. As their is no constructor with parameters
	     * in our class box, it gives error, and we so we created a 
	     * constructor in class box(place cursor on error--->it gives u suggestion
	     * to create a constructor in source class)
	     * Now the error in boxtest is gone-->but their is another error with 
	     * "box b = new box()" , because it wont accept no argument/default constructor
	     * when their is parameterized/argument constructor.
	     * So now we have to create a no argument constructor in class box.
	     * In this case, we are provided initial values as 0,0,0 just to
	     * set the default values to 0.
	     * 
	     *  No argument/default constructor can be used to set default
	     *  value if nothing is passed.
	     *  above if we havent had provided the values with 10, 12 and 8
	     *  using the setter methods, the default values would have been 0
	     *  and the voulume = 0. thats the difference.*/ 
	    System.out.println("Box Width:" + b.getWidth());
	    System.out.println("Box length:" + b.getLenght());
	    System.out.println("Box breadth:" + b.getBreadth());
	    System.out.println("BoxVolume:" + b.calcVolume());
	    
	    System.out.println("-----------------------------------");
	    
	    box b2 = new box(3, 4, 5);
	    System.out.println("Box Width:" + b2.getWidth());
	    System.out.println("Box length:" + b2.getLenght());
	    System.out.println("Box breadth:" + b2.getBreadth());
	    System.out.println("BoxVolume:" + b2.calcVolume());
	}

}
