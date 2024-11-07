package com.JspStringPrgms;

public class RemoveDuplicates {
 
	public static void main(String[] args) {
		String s1="Shrabana";
		String s2="";
		
		
		for(int i=0;i<=s1.length()-1;i++) {
			char C=s1.charAt(i);
			if(!s2.contains(C+""))s2+=C;
		}
		System.out.println(s2);
	}

}
