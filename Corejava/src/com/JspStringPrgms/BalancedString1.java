package com.JspStringPrgms;

import java.util.Stack;

public class BalancedString1 {

	public static void main(String[] args) {
		System.out.println(isBalanced("[{}()]"));
	}
      static boolean isBalanced(String s) {
    	  Stack<Character>st = new Stack<Character>();
    	  char[]a=s.toCharArray();
    	  for(int i =0;i<a.length;i++) {
    		  if(a[i]=='['||a[i]=='{'||a[i]=='(') {
    			  st.push(a[i]);
    		  }
    		  else if(a[i]==']'||a[i]=='}'||a[i]==')') {
    			  if(st.isEmpty()||!pair(st.pop(),a[i]))return false;
    		  }
    	  }
    	  return st.isEmpty();
}	
	
		static boolean pair(char c1,char c2) {
			if(c1=='['&& c2==']')return true;
			if(c1=='('&&c2==')')return true;
			if(c1=='{'&&c2=='}')return true;
		
		return false;
	}
}
