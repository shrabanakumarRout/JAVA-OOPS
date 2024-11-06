package com.Regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test11 {

	public static void main(String[] args) {
		String s = "abcdabbeagebab";
		String exp =("ab*");
		
		Pattern p = Pattern.compile(exp);
		Matcher m =p.matcher(s);
		
		
		while(m.find()) {
			System.out.println("Matched substring: " +m.group());
		    System.out.println("Position start: "+m.start());
			System.out.println("Position end: "+m.end());
		}

	}

}
