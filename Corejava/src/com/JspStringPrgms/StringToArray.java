package com.JspStringPrgms;

public class StringToArray {

	public static void main(String[] args) {
		String s1 = "abcdef";
		char[]arr =s1.toCharArray(); //we can convert the string to Array by call the toCharArray method and store in the char[]arr
		for(char c: arr) { //c store the value of each iteration in the array 
			System.out.println(c);
		}
	}

}
