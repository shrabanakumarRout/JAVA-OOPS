package com.JspStringPrgms;

public class ReverseSentence {

	public static void main(String[] args) {
		String s="java is very very easy";
		String temp=" ";
		String[]str=s.split(" ");
		for(int i =str.length-1;i>=0;i--) {
			temp+= str[i];
			temp+=" ";
		}
		System.out.println(temp);
	}

}
