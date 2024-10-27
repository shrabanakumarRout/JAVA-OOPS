package com.Recursion;

public class SumofFact {
  public static int fact(int n) {
	       if(n==0 || n==1)
	    	   return 1;
	  
	       int store=fact(n-1);
	       int factorial =n*store;
	       return factorial;
  }
	
	
	public static void main(String[] args) {
		int n = 5;
		int result = fact(n);
		System.out.println(result);
	}

}
