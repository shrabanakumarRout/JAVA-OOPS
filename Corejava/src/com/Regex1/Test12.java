package com.Regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test12 {

	public static void main(String[] args) {
		String s = "acbdabeabbbebbb";
		String exp =("ab?"); //minimum 0 and maximum 1 occurrence of previous character
		
		Pattern p = Pattern.compile(exp);
		Matcher m =p.matcher(s);
		
		
		while(m.find()) {
			System.out.println("Matched substring: " +m.group());
		    System.out.println(m.start());
			System.out.println(" Position: "+m.end());
		}

	}

}
