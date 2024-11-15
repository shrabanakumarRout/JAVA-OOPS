package com.Stringpractise;

public class NoOfPallin {

	public static void main(String[] args) {
		String s = "Banana";
		s=s.toLowerCase();
	for(int i=0;i<=s.length()-1;i++) {
		for(int j=i+1;j<=s.length()-1;j++) {
			if(ispallindrome(s,i,j)) {
				System.out.println(s.substring(i,j+1));
			}
		}
		
	}

	}
	
	
	static boolean ispallindrome(String s,int st,int end) {
		
		int  i = st;
		int j=end;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	
	

}
