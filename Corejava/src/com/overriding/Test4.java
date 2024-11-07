package com.overriding;
class A{
	void m1() {
		System.out.println("m1 A");	
		}
	void m2() {
		System.out.println("m2 A");
	}
}
class B extends A{
	@Override
	protected void m1() {  // wider process using method overriding
		System.out.println("m1-B");
	}
	@Override
	public void m2() {      // wider process using method overriding
		System.out.println("m2-B");
	}
}
	
public class Test4 {

	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();

	}

}
