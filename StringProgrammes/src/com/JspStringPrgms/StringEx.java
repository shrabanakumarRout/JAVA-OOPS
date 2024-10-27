package com.JspStringPrgms;

public class StringEx {

	public static void main(java.lang.String[] args) {
		StringEx s1 = new StringEx ("abcd");
		System.out.println(s1);
		
		StringEx s2 = "abcd";
		System.out.println(s2);
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

	}

}
