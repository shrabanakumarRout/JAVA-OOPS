package com.Abstraction;
abstract class Vechile{
	abstract void start();
	abstract void acce();
	abstract void stop();
	                  // to modify the abstract method you have to use Child class otherwise make it as also a abstract class
}
 class Bmw extends Vechile{
	@Override
	void start() {
		System.out.println("Bmw start");
	}
	@Override
	void acce() {
		System.out.println("Bmw running");
	}
	void stop() {
		System.out.println("Bmw stop");
	}
 }
 class Benz extends Vechile{

	@Override
	void start() {
		System.out.println("Benz start");
		
	}

	@Override
	void acce() {
		System.out.println("Benz running");
		
	}

	@Override
	void stop() {
		System.out.println("Benz Stop");
		
	}
	 
 }
	class Driver {
		public static void Drive(Vechile v) { //upcasting the parent cls
			v.start();
			v.acce();
			v.stop();
		}
	}

public class Demo4 {

	public static void main(String[] args) {
		Driver.Drive(new Bmw());
        Driver.Drive(new Benz());
	}

}
