package com.Binding;
class A4{
	static int a = 10;
	int b = 20;
	static void m1() {
		System.out.println("Static int m1A");
	}
	void m2() {
		System.out.println("non static m2A ");
	}
		final void m3() {
			System.out.println("final m3 A");
		
	}
}
class B4 extends A4{
	static int a = 30;
	int b = 40;
	static void m1() {
		System.out.println("static m1 B");
	}
	@Override
	void m2() {
		System.out.println("non-static B");
	}
}
public class Demo3 {
public static void main(String [] args) {
	A4 z = new B4();
	System.out.println(z.a);
	System.out.println(z.b);
	z.m1();
	z.m2();
	z.m3();
	
}
}
