package com.String;

public class Demo1 {

	public static void main(String[] args) {
		String s = new String("abcd");
		System.out.println(s);
		
		String s1="abcd";
		System.out.println(s1);
		
		System.out.println(s.equals(s1)); //Compare the String values
		System.out.println(s==s1);//reference are compared

	}

}
