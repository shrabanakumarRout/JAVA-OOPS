package com.Inheritance;
class A2{
	A2(){
		System.out.println("A-const");
	}
}

class B2 extends A2{
	B2(){
		System.out.println("B-const");
	}
}

class C2 extends B2{
	C2(){
		System.out.println("C-const");
	}
}
public class DEMO4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new C2();
	}

}
