package com.Generic;

public class User {

	public static void main(String[] args) {
		Arraylist<Integer> a=new Arraylist<Integer>();
		System.out.println(a.add(20));
		System.out.println(a.add(40));
		a.add(10, 1);
		a.travesrse();
		System.out.println(a.size());
		
		

	}

}
