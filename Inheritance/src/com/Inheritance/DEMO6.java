package com.Inheritance;
class A4{
	A4(){
		System.out.println("A cons");
	}
}
class B4 extends A4{
	B4(){
		this(10);
		System.out.println("B const");
	}
	B4(int i){
		System.out.println("B-int const");
	}
}
class C4 extends B4{
	C4(){
		System.out.println("C-const");
	}
	C4(int i){
		this();
		System.out.println("C-int const");
	}
}

public class DEMO6 {

	public static void main(String[] args) {
		
			new C4();
			new C4(10);
		
	}

}
