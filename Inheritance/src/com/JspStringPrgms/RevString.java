package com.JspStringPrgms;
public class RevString {

	public static void main(String[] args) {
		System.out.println(reverse("java"));

	}


static String reverse(String s) {
	String s1 = " ";  //local variable declare to store the value s.string value
	for(int i = s.length()-1;i>=0;i--) {
		s1+=s.charAt(i);
	}
	return s1;
}
}
