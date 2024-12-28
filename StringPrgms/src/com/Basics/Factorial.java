package com.Basics;

public class Factorial {

	public static void main(String[] args) {
		int n = 5; //Variable Declaration
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println("Factorial of the number is"+fact);

	}

}
