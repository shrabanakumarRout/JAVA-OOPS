package com.JspStringPrgms;

public class PalindromeWords {

	public static void main(String[] args) {
		String s = "madam is madam";
		s=s.toLowerCase();
		String []str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			if(StriPallindrome.ispallindrome(str[i]))
				System.out.println(str[i]);
		}	
	}	
}
