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
			int minindex = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[minindex]>a[j]) {
					minindex = j;
					  }
			
				int temp = a[minindex];
				a[minindex]=a[i];
				a[i]=temp;
				
			}
		}
	}
}
	