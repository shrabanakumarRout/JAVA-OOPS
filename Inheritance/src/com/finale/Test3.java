package com.finale;
// final variable value can be change through the constructor.
public  class Test3 {
	final int a;
	public Test3(int a) 
	{
		this.a = a; 
	}


	public static void main(String[] args) {
		Test3 t1 = new Test3(10);
		System.out.println(t1.a);
		//t1.a = 30;
        Test3 t2 = new Test3(40);
        System.out.println(t2.a);
	}

}
