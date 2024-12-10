package com.nestedClass;

import com.Innerclass.A.B;

class A{
	static class B{
		void m1() {
			System.out.println("m1 in A.B");
		}
	}
}
public class test1 {

	public static void main(String[] args) {
		 A.B b1 = new A.B();  //nested class can not reference non static members of outer class directly
		 B.m1(); 

	}

}
