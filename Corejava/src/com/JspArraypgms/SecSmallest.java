package com.JspArraypgms;

public class SecSmallest {

	public static void main(String[] args) {
		int []a = {5,3,4,8,5,7,2,3};
		
		int small= a[0];
		int secsmall=a[0];
		
		for(int i =1;i<a.length;i++) {
			if(a[i]==small)continue;
			if(a[i]<small) {
				secsmall=small;
				small=a[i];
			}
			
			else if(a[i]<secsmall || small==secsmall) {
				secsmall=a[i];
			}
		}
		
		System.out.println(secsmall);

	}

}
