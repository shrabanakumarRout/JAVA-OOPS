package com.Regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test21 {

	public static void main(String[] args) {
		String exp = "([a-z]+)\\1"; //
		String str = "banana";
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(str);
		
		while(m.find()) {
			System.out.println(m.group()+" "+m.start()+" "+m.end());
			
		}

	}

}
