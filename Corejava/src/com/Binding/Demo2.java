package com.Binding;
class A3{
	static int i = 10;
	int j = 20;
}
class B3 extends A3{
	static int i = 30;
	int j = 40;
}
public class Demo2 {
public static void main (String [] args) {
	A3 a = new B3();
	System.out.println(a.i);
	System.out.println(a.j);
}
}
