package com.JspStringPrgms;

public class SumStringIntDigit {

	public static void main(String[] args) {
	System.out.println(add("a12b3c43"))	;

	}
	
	
	static int add(String s) {
		char[]a=s.toCharArray();
		int Sum =0;
		
	for(char c:a) {   //iterate the each character 
		if(c>='0' && c<='9') {
			Sum+=c-'0';  //convert the character to integer and add it
		}
		}
	return Sum;
		
	}

}
