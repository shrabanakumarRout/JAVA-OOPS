package com.JspStringPrgms;

public class StriPallindrome {

	public static void main(String[] args) {
		System.out.println(ispallindrome("malayalam"));

	}
	
	
	public static Boolean ispallindrome(String s) {
		int i = 0; int j = s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))return false; {
				i++;
				j--;
			}
			
		}
		return true;
	}

}
