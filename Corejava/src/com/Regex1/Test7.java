package com.Regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test7 {

	public static void main(String[] args) {
		String s = "abaacaaad";
		String exp ="a{2}";
		
		Pattern p = Pattern.compile(exp);
		Matcher m =p.matcher(s);
		
		
		while(m.find()) {
			System.out.print(m.group());
		   // System.out.println(m.reset());
			System.out.print(m.end());

	}

	}

}
