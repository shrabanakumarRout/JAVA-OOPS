package com.Constructor;
class Bike{
	String colour;
	Bike(String c){
		this.colour=c;
	}
}

class Garage{
	void changecolour(Bike a) {
		a.colour="red";
		System.out.println("Bike colour changed to red");
	}
}
public class Test2 {

	public static void main(String[] args) {
		Bike b = new Bike("black");
		System.out.println(b.colour);
		
	    Garage g = new Garage();
	    g.changecolour(b);
	    System.out.println(b.colour);

	}

}
