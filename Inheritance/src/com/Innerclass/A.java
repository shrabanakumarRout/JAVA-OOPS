package com.Innerclass;
//Static Inner class
public class A {
                 public static class B{
                	 public static void m1 () {
                		 System.out.println("M1-static inner method");
                	 }
                	 public void m2() {
                		 System.out.println("m1-Non static inner method");
                	 }
                 }
	public static void main(String[] args) {
		System.out.println("outer main method");
        A.B.m1();
        A.B a = new A.B();
        a.m2();
	}
}
