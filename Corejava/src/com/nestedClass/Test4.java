package com.nestedClass;

interface Driver{
	void drive();
}

class car{
	int num;
	private static int x = 1000;
	car(){
		num = x++;
	}
	
	void start() {
		System.out.println(num + "Car starts");
	}
	
	void accelarate() {
		System.out.println(num + "Car Running");
	}
	
	void stop() {
		System.out.println(num + "Car Stop"); 
	}
	
	public Driver driver() {
		return new Drv();
	}
	
	class Drv implements Driver{
		public void drive() {
			start();
			accelarate();
			stop();
		}
	}
}
public class Test4 {

	public static void main(String[] args) {
		
        car c1 = new car();
        Driver d1 = c1.driver();
        d1.drive();
        
        car c2 = new car();
        Driver d2 = c2.driver();
        d2.drive();
	}

}
