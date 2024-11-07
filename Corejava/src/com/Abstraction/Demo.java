package com.Abstraction;
abstract  class AA{
	AA(){
		System.out.println("AA-const");
	}
	abstract public void m1();
	abstract public void m2();
}
abstract class BB extends AA {
	abstract void m3();
}

abstract class CC extends BB{
	CC(){
		System.out.println("CC-const");
	}
	@Override
	void m3() {
		System.out.println("m3-CC");
	}
	@Override
public	void m1() {
		System.out.println("m1-cc");
	}
}
class DD extends CC{
	DD(){
		System.out.println("DD-const");
	}
	@Override
	public void m2() {
		System.out.println("M2-DD");
	}
}

public class Demo {
public static void main (String[]args) {
  AA a;
  //a = new BB(); // can not create object for Abstract method
 // a.m1();
  //a = new CC();
  //a.m1();
  a = new DD();
  a.m1();
  a.m2();
  
}
}
