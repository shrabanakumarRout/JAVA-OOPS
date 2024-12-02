package com.Generic;

public class Test1 {

	public static void main(String[] args) {
		a<Integer>a1 = new a<Integer>();
		a1.add(10);
		//a1.add("abc"); CTE Bcoz Argument type is Integer.
		System.out.println(a1.get());
		
		a <String> a2 = new a<String>();
		a2.add("Simpul");
		//a2.add(10); CTE Bcoz argument Type is String type.
		System.out.println(a2.get());

	}

}
