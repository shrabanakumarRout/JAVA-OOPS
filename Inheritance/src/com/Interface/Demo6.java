package com.Interface;
interface test11{
	void m1();
}
interface test22{
	void m2();
}
class Ab {
	public void m1() {
		System.out.println("m1-Ab");
	}
}
class CD extends Ab implements test11,test22{

	@Override
	public void m2() {
		System.out.println("m2-CD");
		
	}

	@Override
	public void m1() {
		System.out.println("m1-CD");
	}
	
}
public class Demo6 {

	public static void main(String[] args) {
		test11 t = new CD();
		t.m1(); //m1-cd
		
		test22 t1 = new CD();
		t1.m2(); //m2-cd
		
		Ab t2 = new CD();
		t2.m1(); //m1-Cd
		
		CD t3 = new CD();
		t3.m1(); //m1-cd
		t3.m2(); //m2.cd

	}

}
