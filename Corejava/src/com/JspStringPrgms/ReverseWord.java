package com.JspStringPrgms;

public class ReverseWord {  //along with the sentence

	public static void main(String[] args) {
		String s="java is very very easy";
		String [] str=s.split(" ");
		String temp = " ";
		for(int i = 0;i<str.length;i++) {
			temp+=(RevString.reverse(str[i]));
			temp+= " ";
		}
		System.out.println(temp);
	}

}
