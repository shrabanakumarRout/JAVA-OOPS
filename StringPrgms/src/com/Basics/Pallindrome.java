package com.Basics;

public class Pallindrome {

	public static void main(String[] args) {
		int n=121;
		int temp =n;
		int rev = 0;
		while(n>0)
		{
			int digit=n%10;
			rev =  rev*10 + digit;
			n= n/10;
			
		}
		if(rev==temp)
		{
			System.out.println(rev + " "+ "is a pallindrome number");
		}
		else {
			System.out.println(rev + " "+"is not a Pallindrome number");
		}
	
	}

}
