package com.Array;

public class Demo2 {

	public static void main(String[] args) {
		int a [] = {10,20,30,40};
		int []b;//Create a another empty Array
		b=a; //copy all the values from a to b;
		a[0]=50; // then Add the element in a of 0 index
		System.out.println(b[0]);

	}

}
