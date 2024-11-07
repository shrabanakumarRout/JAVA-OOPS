package com.Abstraction;
abstract class A2{
	A2(){
		System.out.println("A-const");
	}
	abstract public void m1();
	abstract public void m2();
}
abstract class B2 extends A2{
	public  void m3() {
		}
}

  class C2 extends B2{
		C2(){
			System.out.println("CC-const");
		}

		@Override
		public void m3() {
			System.out.println("m3-CC");
		}

		@Override
		public void m1() {
			System.out.println("m1-CC");
			
		}

		@Override
		public void m2() {
			System.out.println("m2-CC");
			
		}
		
	}

public class Demo3 {

	public static void main(String[] args) {
		A2 a = new C2();;
         a.m1();
         a.m2();
        B2 b = new C2();
        b.m1();
        b.m2();
        b.m3();
	}

}
