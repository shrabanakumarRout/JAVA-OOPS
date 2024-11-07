package com.JspArraypgms;
import java.util.Arrays;
public class Demo3 {

	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,6,7,8};
		System.out.println("a = "+Arrays.toString(a));
		
		int b [] = a;
		System.out.println("b = "+Arrays.toString(b));
		
		System.arraycopy(a, 3, b, 4, 3);
		System.out.println("b = "+Arrays.toString(b));
	}

}
