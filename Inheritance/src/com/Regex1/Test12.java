package com.Regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test12 {

	public static void main(String[] args) {
		String s = "abcdabbeagebab";
		String exp =("ab?");
		
		Pattern p = Pattern.compile(exp);
		Matcher m =p.matcher(s);
		
		
		while(m.find()) {
			System.out.println("Matched substring: " +m.group());
		   // System.out.println(m.reset());
			System.out.println(" Position: "+m.end());
		}

	}

}
