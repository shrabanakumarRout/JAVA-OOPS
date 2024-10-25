package com.finale;
class A{
	static void m1(){
		System.out.println("m1-A");
	}
}

class B extends A{
	// method Hiding :- Creating a static method in child class exactly same signature as parent class static method
	final static void m1() {
		System.out.println("m1-B");
	}
}
class C extends B{
	
}
public class Test {

	public static void main(String[] args) {
		B b1 = new B();
		b1.m1();
		C c1 = new C();
		c1.m1();

	}

}
