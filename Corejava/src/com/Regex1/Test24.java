package com.Regex1;

import java.util.regex.Pattern;

public class Test24 {

	public static void main(String[] args) {
	System.out.println(ispassword("asg@hidA#jg9"));	

	}
	
	
	static boolean ispassword(String pwd) {
		String exp="(?=.*[!@#$])(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,15}";
		Pattern P = Pattern.compile(exp);
		return P.matcher(pwd).matches();
	}

}
