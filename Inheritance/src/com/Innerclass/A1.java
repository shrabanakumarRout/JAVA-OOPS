package com.Innerclass;
//Non static inner class
public class A1 {
class B1{
	public static void m1() {
		System.out.println("Static-Inner class");
	}
	void m2() {
		System.out.println("Non static m2");
	}
}
	public static void main(String[] args) {
		System.out.println("Static Outer m2");
		A1.B1.m1();
		A1 a = new A1();
		A1.B1 b = a.new B1();
		b.m2();

	}

}
