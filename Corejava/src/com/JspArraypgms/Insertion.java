package com.JspArraypgms;

import java.util.Arrays;

public class Insertion {

	public static void main(String[] args) {
		int[]a= {3,6,2,8,9,1};
     System.out.println(Arrays.toString(a));
     insert(a);
     System.out.println(Arrays.toString(a));
	}
	
	
	public static void insert(int a[]) {
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			
			
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
		
		a[j+1]=key;
		}
	}

}
