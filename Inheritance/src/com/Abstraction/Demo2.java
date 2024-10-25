package com.Abstraction;
abstract class A1{
	abstract public void m1();
	abstract public void m2();
}
abstract class  B1 extends A1{
	public void m1() {
		System.out.println("m1-B");
	}
}
class C1 extends B1{
	@Override
	public void m2() {
		System.out.println("M2-C");
	}
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A1 a = new C1();
         a.m1();
         a.m2();
         B1 b = new C1();
         b.m1();
         b.m2();
	}

}
