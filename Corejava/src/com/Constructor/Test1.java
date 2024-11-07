package com.Constructor;
class Box{
	int height;
	int length;
	int width;
	
	Box(int height,int length,int width){
		this.height=height;
		this.length=length;
		this.width=width;
	}
	
	Box(int d){
		this.height=d;
		this.length=d;
		this.width=d;
	}
	
	
	 void Display() {
		 System.out.println("height="+" "+height+"length="+" "+length+"width="+" "+width);
	 }
}
public class Test1 {

	public static void main(String[] args) {
		Box b1 = new Box(10,20,30);
		b1.Display();
		
		Box b2 = new Box(50);
		b2.Display();

	}

}
