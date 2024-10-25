package com.Inheritance;
class AA{
	static int i= 10;
	static void m1() {
		System.out.println("m1-AA");
	}
}

class BB extends AA{
	int j = 20;
	void m2(){
		System.out.println(super.i);
		super.m1();
		//BB c = new BB();
		//System.out.println(c.j);
		System.out.println("m2-BB");
	}


//class CC extends BB{
	static void m3() {
		//System.out.println(super.i);
		m1();
		AA.i = 30;
		System.out.println(i);
		//Super.m1();
		
	}
	}

public class DEMO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AA.i);
		AA.m1();
        BB b = new BB();
        System.out.println(b.j);
        b.m2();
        b.m3();
      
	}

}
