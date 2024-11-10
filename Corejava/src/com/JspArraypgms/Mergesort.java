package com.JspArraypgms;

import java.util.Arrays;

public class Mergesort {

	public static void main(String[] args) {
		 int a[]= {2,6,3,7,1};
		 sort(a);
		 System.out.println(Arrays.toString(a));
	}
	
	
	public static void sort(int a[]) {
		if(a.length==1) return;
		int[]left=new int [a.length/2];
		int right[]=new int[a.length-left.length];
		
		int i = 0;
		while(i<left.length) {
			left[i]=a[i];
			i++;
			}
		int j=0;
		while(j<right.length) {
			right[j]=a[i];
			i++;
			j++;	
		}
		
		sort(left);
		sort(right);
		merge(left,right,a);
	}
	
	
public static void merge(int[]a,int b[],int []c) {
	int i=0;int j=0;int k=0;
	while(i<a.length &&j<b.length) {
		if(a[i]<b[j]){
			c[k]=a[i];
			k++;
			i++;
		}else {
		c[k]=b[j];
		k++;
		j++;
	  }
	} 
	while(i<a.length) {
		c[k++]=a[i++];	
	}
	while(j<b.length) {
		c[k++]=b[j++];
	}
}
}
