package com.Interface;
interface i1{
    abstract void m1(); //Abstract public void method
}
abstract class B implements i1{
	abstract void m2(); 
}
class C extends B{

	@Override
	public void m1() {
		System.out.println("M1-C");	
	}

	@Override
	void m2() {
		System.out.println("M2-C");	
		
	}
	
}
public class Demo {

	public static void main(String[] args) {
		i1 i = new C(); // Upcasting
		i.m1();  //Abstract method implementation will be Doing by extends Subclass 
		//i.m2();
		B b = new C(); //create the object of child class and store it in parent class reference variable 
		b.m1();
		b.m2();

	}

}
