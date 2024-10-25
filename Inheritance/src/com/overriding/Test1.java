package com.overriding;
class Animal{
	void makesound(){
		System.out.println("sound of animal");
	}
}
class Dog extends Animal{
	@Override
	void makesound() {
		System.out.println("Bhou Bhou");
	}
}
class Babydog extends Dog {
	@Override
	void makesound(){
		System.out.println("weeeping");
	}
}
class Cat extends Animal{
	//@Override
	//void makesound() {
	//System.out.println("meow");
	//}
}
public class Test1 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.makesound();
		
		Babydog b = new Babydog(); 
		b.makesound();
		
        Cat c= new Cat();
        c.makesound();
	}

}
