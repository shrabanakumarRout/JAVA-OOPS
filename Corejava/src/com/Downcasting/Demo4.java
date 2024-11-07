package com.Downcasting;
class A3{
	static int i = 10;
}
class B3 extends A3{
	int j;
	int k;

public  B3(int j,int k) {      // Create a constructor for B class
	this.j = j;
	this.k = k;
}
}
public class Demo4 {
	public static void Display(A3 a) {
		System.out.println(a.i); 
		//System.out.println(a.j);
		//System.out.println(a.k);
		//A3 a = new B3();
		B3 b = (B3) a; //Down Casting;
		System.out.println(b.i);
		System.out.println(b.j);
		System.out.println(b.k);
		System.out.println(a.i);
		System.out.println(a.i);
		System.out.println(a.i);
	}
	public static void main(String[] args) {
		Display(new B3 (20,30)); //UP casting;
	}

}
