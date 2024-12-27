package com.Basics;

public class Fibanacci {

	public static void main(String[] args) {
		int n=10;
		int a=0;
		int b=1;
		int c;
		
		for(int i=0;i<=n;i++)
		{
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}

	}

}
