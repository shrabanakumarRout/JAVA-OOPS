package com.Interface;
interface S1{
	void m1();
}
interface S2{
	void m1();
}
class B11 implements S2{

	@Override
	public void m1() {
		System.out.println("S1-B");
	}
	
}
public class Demo3 {

	public static void main(String[] args) {
		S2 i = new B11();
		i.m1();
		
		S2 i2 = new B11();
		i2.m1();

	}

}
