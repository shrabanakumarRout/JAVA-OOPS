package com.Stringpractise;

public class Countdigit {

	public static void main(String[] args) {
		String s = "shrabana kumar Rout";
        System.out.println(isCount(s)); 
	}
    
	static int isCount(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			//char a = s.charAt(i);
		count++;
		}
	return count;
	}
}