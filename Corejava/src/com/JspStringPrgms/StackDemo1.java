package com.JspStringPrgms;

import java.util.Stack;

public class StackDemo1 {

	public static void main(String[] args) {
		Stack<Character>st=new Stack<Character>();
		System.out.println(st.isEmpty());
		
		st.push('a');
		st.push('b');
		
		System.out.println(st.isEmpty());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.isEmpty());

	}

}
