package com.JspArraypgms;

import java.util.Arrays;

public class Rotate {

	public static void main(String[] args) {
	    int[]a= {1,2,3,4,5};
	    rotate(a);
	    System.out.print(Arrays.toString(a));
	}
	
	
	
	static void rotate(int []a) {
		int len = a.length;
		int temp = a[len-1];
		
		for(int i=len-2;i>=0;i--) {
			a[i+1]=a[i];
		}
		a[0]=temp;
		
	}

}
