package com.JspStringPrgms;

public class Panagram {

	public static void main(String[] args) {
	System.out.println(ispanagram("A quick brown fox jumps over the lazy dog"));	

	}

	
	static boolean ispanagram(String s) {
		s=s.toLowerCase();
		while(s.length()<26) return false;
		for(char ch = 'a';ch<='z';ch++) {
			if(s.indexOf(ch)== -1)return false;
		}
		return true;
	}
}
