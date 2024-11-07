package com.Inheritance;
class A5{
	{
	System.out.println("non-static-block A");
	}
	static {
		System.out.println("Static-block A");
	}
	A5(){
		System.out.println("A-const");
	}
}
class B5 extends A5{
	
	{
		System.out.println("non-static block B");
	}
	static {
		new A();
		System.out.println("static block b");
	}
	B5(){
		System.out.println("B-const");
	}
}
public class DEMO7 {
	static {
		System.out.println("static block test");
	}

	public static void main(String[] args) {
		System.out.println("main starts");
		new B5();
		System.out.println("main ends");
     }

}
