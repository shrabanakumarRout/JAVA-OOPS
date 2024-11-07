package com.JspStringPrgms;

public class Stringpermutation {

	public static void main(String[] args) {
		String s1 ="abcd";
		int endindex=s1.length()-1;
		permutation(s1,0,endindex);

	}
	
	static void permutation(String s,int st,int end) {
		if(st>=end) {
			System.out.println(s);
			return;
		}
		for(int i=st;i<=end;i++) {
		String s1	=Swap(s,st,i);
			permutation(s1,st+1,end);
		}
	}
	
	
	static String  Swap(String s,int i,int j){
		     char[]a=s.toCharArray();
		     char temp = a[i];
		     a[i]=a[j];
		     a[j]=temp;
		     return new String(a);
		}

}
