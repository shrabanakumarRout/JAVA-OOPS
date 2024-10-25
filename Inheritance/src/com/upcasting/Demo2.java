package com.upcasting;
class A1{
	
}
class B1 extends A1{
	
}

class C1 extends B1{
	
}

class D1{
	
}
public class Demo2 {
	public static void m1(A1 a) {
		System.out.println("m1 is Called");
	}

	public static void main(String[] args) {
		m1 (new A1());
		m1(new B1());
		m1(new C1());

	}

}
