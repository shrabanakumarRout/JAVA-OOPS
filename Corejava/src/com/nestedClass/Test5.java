package com.nestedClass;
interface I
{
	void m1();
}
public class Test5 {

	public static void main(String[] args) {
		I ref = new I()
				{
			        public void m1() {
			        	System.out.println("m1");
			        }
				};
				ref.m1();

	}

}
