package com.Regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test22 {

	public static void main(String[] args) {
		String exp = "[0-9]{3}";
		String str = "256";
		
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(str);
		System.out.println(m.matches());
		
		
		
		

	}


}
