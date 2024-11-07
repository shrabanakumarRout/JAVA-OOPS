package com.Regex1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test23 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in) ;
		System.out.println("Enter the Number");
		String phn = sc.nextLine();
		
		if(isPhonenum(phn)) {
			System.out.println("valid");
		}
		else{
			System.out.println("Invalid");
		}
		

	}
	
	public static boolean isPhonenum(String p) {
	Pattern ptn = Pattern.compile("[6-9][0-9]{9}");
	return ptn.matcher(p).matches();
	}

}
