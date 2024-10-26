package com.objectclass;

public class Demo2 {

	public static void main(String[] args) {
		B b1 = new B(10,20);
		B b2 = new B(10,20);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1==b2); //check the creation of the reference type in a same memory
		System.out.println(b1.equals(b2)); //check the value of both the object that create in the memory of the class

	}

}
