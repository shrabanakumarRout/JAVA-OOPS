package com.Oops;

public class Test1 {
      static int i = 10;
      int j = 30;
	public static void main(String[] args) {
		System.out.println(i);
		i = 20;
		Test1 t1 =new Test1();
		System.out.println(t1.i);
		System.out.println(t1);//Address
	}

}
