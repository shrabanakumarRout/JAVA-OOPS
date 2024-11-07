package com.Downcasting;
class A2{
	static int i = 10;
	int j = 20;
	static void m1(){
		System.out.println("static m1 - A");
	}
	void m2() {
		System.out.println("Non static m1 - A");
	}
}
class B2 extends A2{
	static int i = 30;
	static int j = 40;
	static void m1()
{
		System.out.println("Static-m1-B");
      }
	@Override
	void m2() {
		System.out.println("Non static m1-B");
	}
}
public class Demo3 {

	public static void main(String[] args) {
		A2 a1 = new A2(); //normal object create to print non static method call ; 
		a1.m2();
		a1.m1();
		System.out.println("-------------------------------------------");
		A2 a = new B2(); //Up casting
		System.out.println(a.i); //10
		System.out.println(a.j); //20
		a.m1();
		a.m2();
		B2 b = (B2)a; //down casting
		System.out.println(b.i);
		System.out.println(b.j);
		a.m1();
		a.m2();
		System.out.println("------------------------------------------------");
		b.m1();
		b.m2();
		System.out.println(a.i);
		System.out.println(a.j);

	}

}
