package com.JspStringPrgms;

public class CountIntString {

	public static void main(String[] args) {
		String s1 = "aaabbcaa";
		char[]a=s1.toCharArray();
		String s2 = "";
		int i = 0;char c;
		
		while(i<a.length) {
			c=a[i];
		int	count=0;
			while(i<a.length && a[i]==c) {
				count++;
				i++;
			}
			s2=s2+count+c;
			}
		System.out.println(s2);
		}
	}


