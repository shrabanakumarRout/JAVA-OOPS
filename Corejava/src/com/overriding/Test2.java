package com.overriding;
class Vechile{
	void start(){
		System.out.println("vechile is start");	
		}
	void accelarator() {
		System.out.println("vechile is running");
	}
	void stop() {
		System.out.println("vechile is stop");
	}
}

class Bmw extends Vechile{
	@Override
	void start(){
		System.out.println("BMW start");
		}
	void accelarator() {
		System.out.println("BMW run");
		}
	void stop() {
		System.out.println("BMW stop");
	}
}
public class Test2 {

	public static void main(String[] args) {
		Bmw b = new Bmw();
		b.start();
		b.accelarator();
		b.stop();

	}

}
