package com.JspStringPrgms;

public class Demo {
	public static void main (String [] args) {
		String  s = new String("abcd");
		System.out.println(s);
		
		
		String s1= "abcd";
		System.out.println(s1);
		
		System.out.println(s.equals(s1)); //Compare the String values
		System.out.println(s==s1); //Reference are Compared
	}

}
