package com.Interface;
interface Test1{
	void m1();
}
interface Test2{
	void m2();
}
interface Test3{
	void m3();
}
class B123 implements Test1,Test2,Test3{
	@Override
	public void m3() {
		System.out.println("m3-B");
		}
	@Override
	public void m2(){
		System.out.println("m1-B");
		}
	@Override
    public void m1() {
    	System.out.println("m1-A");
    }
}
public class Demo4 {

	public static void main(String[] args) {
		Test1 t = new B123(); //UpCasting
		t.m1();
		Test2 t1 = new B123();
        t1.m2();
        
	}

}