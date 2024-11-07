package com.Inheritance;
class D{
	static {
		System.out.println("static-Block-A");
	}
}
class E extends D{
	static {
		System.out.println("Static-block-B");
	}
}
public class F {
	static {
		System.out.println("Static-block-test"); // when The Program run main method class will load and execute the static block;
	}
	public static void main(String[]args) {
		System.out.println("Main-Starts");
		E e1 = new E();
		System.out.println("Main-Ends");
	}

}
