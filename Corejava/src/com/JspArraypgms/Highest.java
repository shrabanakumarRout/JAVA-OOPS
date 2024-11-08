package com.JspArraypgms;

public class Highest {

	public static void main(String[] args) {
		int []a= {3,6,8,3,9,7};
		
		int high=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(high<a[i]) {
				high=a[i];
			}
		}
		System.out.println(high);

	}

}
