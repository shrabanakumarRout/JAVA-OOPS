package com.Abstraction;
abstract class shape{
	String colour;
	public shape(String colour) {             // Creating a constructor
		this.colour = colour;    //this() is used to access the current Object
	}
	abstract public void Display();
	abstract public  void geteArea();
}
class Rectangle extends shape {
	int length;
	int breadth;
	public Rectangle(String colour,int length,int breadth) {
		super(colour);
		this.length = length;
		this.breadth = breadth;
		}
	@Override
	public void Display() {
		System.out.println(length+" "+breadth);
		}
	@Override
	public void geteArea() {
		System.out.println(length*breadth);
		
	}
}
class circle extends shape{
       int radius;
	public circle(String colour,int radius) {
		super(colour);
		this.radius=radius;
		
	}
	@Override
	public void Display() {
		System.out.println(colour + " " + radius);	
	}
	@Override
	public void geteArea() {
		System.out.println(3.14*(radius*radius));
		
	}
	
}
public class Demo5 {

	public static void main(String[] args) {
		shape s; //object create
		s = new Rectangle("black",5,10);
		s.Display();
		s.geteArea();
        shape c;
        c = new circle("black",5);
        c.Display();
        c.geteArea();
	}

}
