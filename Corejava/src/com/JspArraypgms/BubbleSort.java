package com.JspArraypgms;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {5,9,7,8,1,3,6};
		System.out.println(Arrays.toString(a));
		sorting(a);
		System.out.println(Arrays.toString(a));
		//System.out.println(a.length);

	}
	
	static void sorting(int []a) {
		for(int j=0;j<a.length-1;j++) {
			
		
		for(int i=0;i<a.length-1-j;i++) {
			if(a[i]>a[i+1]) {
				int temp = a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
	}
	}
}
