package com.Regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test10 {

	public static void main(String[] args) {
		String s = "abcdabbeagebabbb";
		String exp =("ab+"); //minimum 1 and more occurrence of previous character
		
		Pattern p = Pattern.compile(exp);
		Matcher m =p.matcher(s);
		
		
		while(m.find()) {
			System.out.println("Matched substring: " +m.group());
		    System.out.println(m.start());
			System.out.println(" Position: "+m.end());
		}

	}

}
