//#10
package com.oop.practice;
//example for abstraction and overriding.
public class ShapeTest {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		
		r.setLength(10.0);
		r.setWidth(10.0);
		System.out.println("Rectangle length:  " + r.getLength());
		System.out.println("Rectangle width:  " +  r.getWidth());
		System.out.println("Rectangle Area:  " +   r.calculateArea()); // while selecting method observe triangle shape beside the method which indicates it's a overridden method
		
		
		Circle c = new Circle();
		
		c.setRadius(10);
		System.out.println("Circle Radius: " + c.getRadius());
		System.out.println("Circle Area: " + c.calculateArea());

		Shape[] shapes  = {r, c};
		aMethod(shapes);
		
		r.print(); //this method is overriden in rectangle class-->so that message will be printed as
		// r is a rectangle class object.
		
		c.print(); // Here der is no overriding of this mehod in circle class, so as c is a sub class object
		//for class Shape, --> It executes the method stated in shape class.
	}
	
		static void aMethod (Shape[] shapes)  {				
		 double areasum = 0.0;
		 for (int i=0; i < shapes.length; i++) {
		 double area = shapes[i].calculateArea();
		 System.out.println("Shapes[" +i+ "] area: " + area);  // look at the code in this line
		 areasum += area;
		 }
				
//		OR	double areasum = 0.0;
//			for (int i=0; i < shapes.length; i++) {
//				areasum += shapes[i].calculateArea(); }
						
			System.out.println("Total area: " + areasum);
			
			System.out.println();
		}
	

}
