package com.String;

public class Demo3 {

	public static void main(String[] args) {
		String s="java";
		
		for(int i=0;i<=s.length();i++) {
			System.out.print(s.charAt(i));
		}
		System.out.print("------------------------------");
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}

	}

}
