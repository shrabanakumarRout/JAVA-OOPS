package com.JspStringPrgms;
public class StringNoOfPallindrome {
static boolean ispallindrome(String s,int st,int end) {
		
	s=s.toLowerCase();
	int i = st;
	int j = end;
	while(i<j) {
		if(s.charAt(i) != s.charAt(j)) return false;
		i++;
		j--;
	}
	return true;
}



	public static void main(String[] args) {
		String s = "banana";
		for(int i = 0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++ ) {
				if(ispallindrome(s,i,j)) {
					System.out.println(s.substring(i,j+1));
				}
			}
		}

	}

}
