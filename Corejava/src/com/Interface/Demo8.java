package com.Interface;
interface Test13{
	void m1();
}
interface Test23 extends Test13{
	@Override
	default void m1() {
		System.out.println("m1-Test23");
	}
}
class B4 implements Test23{
	public void m1() {
		System.out.println("m1-b4");
	}
}
public class Demo8 {

	public static void main(String[] args) {
		Test13 t =new B4();
		t.m1();
		
        

	}

}
