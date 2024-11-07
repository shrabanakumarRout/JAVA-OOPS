package com.Downcasting;
class A4{
	
}
class B4 extends A4{
	
}
class C4 extends B4{
	
}
public class Demo5 {

	public static void main(String[] args) {
		A4 a = new B4(); //Up casting
		B4 b = (B4)a;  // Down casting
		
        B4 b1 = new C4(); // up casting
        C4 c = (C4) b1;   // Down casting
        
        A4 a2 = new C4(); //up casting 
        C4 c1 = (C4)a2;   //Down casting
	}

}
