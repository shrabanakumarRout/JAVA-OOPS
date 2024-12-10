package com.nestedClass;
class C{
	class D
	{
		void m1() {
			System.out.println("m1 in C.D");
		}
	}
}
public class Test2 {

	public static void main(String[] args) {
		
        C c1 = new C();
        C.D d1=c1.new D();
        d1.m1();
        		
	}

}
