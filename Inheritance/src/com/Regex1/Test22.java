package com.Regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test22 {

	public static void main(String[] args) {
		String exp = "[0-9]{4}";
		String str = "3456";
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(str);
		System.out.println(m.matches());

	}

}
