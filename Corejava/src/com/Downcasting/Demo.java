package com.Downcasting;
class A {
	
}
class B extends A{
	
}
class C extends A{
	
}

public class Demo {

	public static void main(String[] args) {
		A a = new B(); // Up Casting 
		B b = (B)a; // Down Casting
         A a1 = new C(); // Up Casting C class 
         C c = (C)a1; //Down casting 
	}

}
