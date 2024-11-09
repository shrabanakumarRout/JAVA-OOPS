package com.JspArraypgms;
import java.util.Arrays;
public class SelectionSort {

	public static void main (String []args) { 
		int []a= {5,7,4,2,6,3,8,1};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
		
		
}
	static void sort(int a[]) {
		for(int i = 0;i<a.length-1;i++) {
			int miniindex = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[miniindex]>a[j]) {
					miniindex = j;
					
				}
			
				
				int temp = a[miniindex];
				a[miniindex]=a[i];
				a[i]=temp;
				
			}
		}
	}
}
	