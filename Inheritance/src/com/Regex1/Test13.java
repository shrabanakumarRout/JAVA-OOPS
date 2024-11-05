package com.Regex1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Test13 {

	public static void main(String[] args) {
		String s = "a123b45c67";
		String exp = "[0-9]";//(+) it will add the 123+45+67.
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		
		
		int sum = 0;
		while(m.find()) {
			sum+=Integer.parseInt(m.group());
		}
           System.out.println(sum);
	}

}
