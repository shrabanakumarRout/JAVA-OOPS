package com.upcasting;
class A{
	public static void m1() {
	System.out.println("m1-A");
	}
}
class B extends A{
	public static void m1() {
		System.out.println("m1-B"); 
	}
}
public class Demo {

	public static void main(String[] args) {
		A a = new B();
		a.m1();
	}

}
