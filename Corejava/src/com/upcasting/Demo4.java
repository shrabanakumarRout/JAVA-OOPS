package com.upcasting;
class A2{
	void m1() {
		System.out.println("m1-A");	
		}
}
class B2 extends A2{
	void m2() {
		System.out.println("m2-b");
	}
}
class C2 extends B2{
	void m3() {
		System.out.println("m2 -c");
	}
}
public class Demo4 {

	public static void main(String[] args) {
		A2 a = new B2();
		a.m1();   //Type casting
		//a.m2();
		B2 b = new C2();
		b.m1();
		b.m2();
		//b.m3();

	}

}
