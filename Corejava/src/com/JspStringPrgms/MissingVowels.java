package com.JspStringPrgms;

public class MissingVowels {

	public static void main(String[] args) {
		
	String s = "shrabanee";
	String s1 = "a e i o u";
	int i = 0;
	
	while(i<s.length()) {
	char c	  = s.charAt(i);
	if(c=='a' || c=='e' || c=='i' || c =='o' ||c=='u') {
		s1=s1.replace(c+"", "");
       }
	i++;
	}
	
	System.out.println(s1);
	String s2 = s1.toUpperCase();
	System.out.println(s2);
	}
}
