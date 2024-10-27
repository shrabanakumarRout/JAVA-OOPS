package com.JspStringPrgms;
import java.util.Scanner;
public class StringVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		int res = (Vowel(s));
		System.out.println("number of vowels " + res);
	
	}

	
	public static int Vowel(String s) {
		int count = 0;
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'||s.charAt(i)=='o' || s.charAt(i)=='u')
			count ++;
		 }
		return count;
	}
}
