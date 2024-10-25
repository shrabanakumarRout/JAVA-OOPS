package com.objectclass;

public class Demo2 {

	public static void main(String[] args) {
		B b1 = new B(10,20);
		B b2 = new B(10,20);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));

	}

}
