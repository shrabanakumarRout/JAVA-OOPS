package com.JspStringPrgms;

public class PalindromeWords {

	public static void main(String[] args) {
		String s = "Madam is Madam";
		String []str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			if(StriPallindrome.ispallindrome(str[i]))
				System.out.println(str[i]);
		}
		
	}
	
}
