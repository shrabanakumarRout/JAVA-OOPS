package com.Basics;

public class Perfect {

	public static void main(String[] args) {
		int n = 22; //Variable Declaration
		int sum = 0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
			}
		if(n==sum) {
			System.out.println(n+ " "+"is a perfect number");
		}
		else {
			System.out.println(n+ " "+ "is not a perfect number");
		}

	}

}
