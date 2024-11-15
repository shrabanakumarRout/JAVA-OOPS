package com.Stringpractise;

public class StringSum {

	public static void main(String[] args) {
		System.out.println(isadd("a12b3c43"));

	}
	
	
	static int isadd(String s) {
		char[]a=s.toCharArray();
		int sum = 0;
		String s1="";
		int i = 0;
		while(i<a.length) {
			s1="";
			while(i<a.length && a[i]>='0' && a[i]<='9') {
				s1+=a[i];
				i++;
			}
			
			if(s1.length()>0)sum+=Integer.parseInt(s1);
			i++;
		}
		return sum;
	}

}
