package com.Innerclass;

public class A2 {

	public static void main(String[] args) {
		class B2{
			public static void m1(int a,int b) {
				System.out.println(a+b);
			}
		}
		B2 b2 = new B2();
		b2.m1(10,20);
	}

}
