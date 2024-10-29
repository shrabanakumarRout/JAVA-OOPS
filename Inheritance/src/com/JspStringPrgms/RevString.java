package com.JspStringPrgms;
public class RevString {

	public static void main(String[] args) {
		System.out.println(reverse("Java"));

	}


public static String reverse(String s) {
	s=s.toLowerCase();
	String temp = " ";  //local variable declare to store the value s.string value
	for(int i = s.length()-1;i>=0;i--) {
		temp+=s.charAt(i);
	}
	return temp;
}
}
