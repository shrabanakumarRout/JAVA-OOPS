package com.Exception;

public class Test {

	public static void main(String[] args) {
		System.out.println(10%0.0);
		System.out.println(10/0.0);
		
	//	System.out.println(10/0); To Handle this exception we use try catch
		
		try {
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println("We can not divide Any number with Zero");
		}

	}

}