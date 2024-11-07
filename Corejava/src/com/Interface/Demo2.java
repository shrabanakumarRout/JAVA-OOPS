package com.Interface;
interface i11{
	void m1();  //Abstract method
}
interface i22 extends i11{
	void m2();
}
class B1 implements i22{

	@Override
	public void m1() {
	System.out.println("m1-B");	
	}

	@Override
	public void m2() {
		System.out.println("m2-B");
		
	}
	
	
}
public class Demo2 {
	
	public static void main (String [] args) {
         i11 i  =new B1();  //Upcasting
         i.m1();
         
         i22 a = new B1();
         a.m1();
         a.m2();
	}

}
