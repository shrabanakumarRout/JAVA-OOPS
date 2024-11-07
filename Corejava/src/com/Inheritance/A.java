package com.Inheritance;

public class A {
int i =10;
void m1() {
	System.out.println("m1-A");
}
}

class B extends A{
	int j = 20;
	void m2()
	{
		System.out.println("m2-B");
	}
}

class C extends B{
	int k = 30;
	void m3() {
		System.out.println("m3-c");
	}
}

class Demo
{
	public static void main (String [] args)
	{
		//A a = new A();
		//System.out.println(a.i);
		//B b = new B();
		//System.out.println(b.j);
		C c = new C();
		System.out.println(c.i);
		System.out.println(c.j);
		System.out.println(c.k);
		}
}