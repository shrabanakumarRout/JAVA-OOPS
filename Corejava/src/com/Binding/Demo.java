package com.Binding;
class A{
	static void M1() {
		System.out.println("Static m1 A");
	}
	void M2() {
    System.out.println("Non static m2 A");		
	}
}

class B extends A{
	static void M1(){
		System.out.println("Static m1 B");
		}
	void M2() {
		System.out.println("non static m2 B");
	}
}
public class Demo {

	public static void main(String[] args) {
		A a = new B();  //object creation stores the non static and reference type store the static method
		a.M1();  //binding method
		a.M2();  //Binding method
 
	}

}
