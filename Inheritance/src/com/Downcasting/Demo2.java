package com.Downcasting;
class A1{
	void m1() {
		System.out.println("m1-A");
		}
}
class B1 extends A1{
	@Override
	void m1() {
		System.out.println("m1-A2");
	}
	void m2() {
		System.out.println("m2-A");
	}
}
public class Demo2 {

	public static void main(String[] args) {
		A1 a = new B1(); // Up casting
		a.m1();
		//a.m2(); // CTE can not inherit the child class type during Type Casting.
		B1 b = (B1) a;
		b.m1();
		b.m2();

	}

}
