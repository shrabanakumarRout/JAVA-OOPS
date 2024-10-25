package com.upcasting;
class Vechile{
	
}
class Bmw extends Vechile{
	
}
class Audi extends Vechile{
	
}
class Bmwx extends Bmw{
	
}

public class Demo3 {
public static void Drive(Vechile v) {
	System.out.println("Driving");
}
	public static void main(String[] args) {
		Drive(new Bmw());
		Drive(new Audi());
		Drive(new Bmwx());

	}

}
 