package com.Inheritance;
class A3{
	A3(){
		System.out.println("A-const");
	    }
}

class B3 extends A3{
	B3(){
		//this(10);
		System.out.println("B-const");
	    }

 B3(int i)
        {
	    System.out.println("B-int-const");
        }
}

class C3 extends B3{
	C3(){
		System.out.println("C-const");
	    }
	
 C3(int i)
        {
	    this();
	    System.out.println("C-Int-const");
        }
}
public class DEMO5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new C3();
           new C3(10);
	}

}
