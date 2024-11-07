package com.Interface;
interface Test12{
	default void m1() {
		System.out.println("m1-I1");
	}
}
class BC implements Test12{

	@Override
	public void m1() {
		Test12.super.m1();
		System.out.println("m1-BC");
	}
	
}
public class Demo7 {

	public static void main(String[] args) {
         Test12 t = new BC();  //UpCasting
         t.m1();
        // BC b = (BC) Test12 (We can't do the **DownCasting** because in Interface we can not create the object) 
	}

}
