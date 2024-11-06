package com.Regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test9 {

	public static void main(String[] args) {
		String s = "a1b3268d6df14";
		String exp =("[0-9]{2}");
		
		Pattern p = Pattern.compile(exp);
		Matcher m =p.matcher(s);
		
		
		while(m.find()) {
			System.out.println("Matched substring: " +m.group());
		   // System.out.println(m.reset());
			System.out.println(" Position: "+m.end());
		}

	}

}