package com.JspStringPrgms;

public class Encode {

	public static void main(String[] args) {
		String s = "jsp";
		String encodeStr = encode(s,5);
		System.out.println(encodeStr);

	}
	
	
	
	public static String encode(String s,int j) {
		char a[]=s.toCharArray();
		char [] letters="abcdefghijklmnopqrstuvwxyz".toCharArray();
		
		for(int i=0;i<a.length;i++) {
			char c = a[i];
			a[i]=letters[((c-97)+1)%26];
		}
		return new String(a);
	}

}
