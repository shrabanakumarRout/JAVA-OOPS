package com.Regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test20 {

	public static void main(String[] args) {
		String exp = "([a-z])\\1*";
		String str ="success";
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(str);
		
		
		String  s2 = " ";
		while(m.find()){
			//System.out.println(m.group());
			String s1 = m.group();
			//System.out.println(s1.length());
			s2=s2+s1.length()+s1.substring(0,1);
			}
		System.out.println(s2);

	}
  
}
