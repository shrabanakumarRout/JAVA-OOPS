package com.finale;
class A1{
	public void m1() {
		System.out.println("m1-A");
	}
}
class B1 extends A1{
	@Override
	final public void m1() {
		System.out.println("m1-B");
	}
}
class C1 extends B1{
	
}
public class Test4 {

public static void main(String[] args) {
		 B1 b = new B1();
		 b.m1();
		 A1 a = new A1();
		 a.m1();
		 C1 c = new C1();
		 c.m1();
	}

}
