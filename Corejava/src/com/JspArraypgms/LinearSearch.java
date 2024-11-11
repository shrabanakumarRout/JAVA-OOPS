package com.JspArraypgms;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {3,4,6,5,8,9,1,7,};
		System.out.println(search(a,5));
		System.out.println(search(a,2));

	}
	
	static boolean search(int a[],int e) {
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==e)return true;
		}
		return false;
	}

}
