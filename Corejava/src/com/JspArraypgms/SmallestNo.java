package com.JspArraypgms;

public class SmallestNo {

	public static void main(String[] args) {
		int a[] = {5,4,3,7,6,8,1};
		int smallest = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<smallest) {
				smallest=a[i];
			}
		}
		System.out.println(smallest);

	
	}
}
