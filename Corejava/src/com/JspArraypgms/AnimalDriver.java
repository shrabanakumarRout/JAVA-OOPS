package com.JspArraypgms;
interface Animal{
	void makesound();
}

class Dog implements Animal{
	@Override
	public void makesound() {
		System.out.println("Bow Bow");
	}
	
	void jump() {
		System.out.println("Jumped");
	}
}

class Cat implements Animal{
	@Override
	public void makesound() {
		System.out.println("meow meow");
	}
}


public class AnimalDriver {

	public static void main(String[] args) {
		
		Animal a[]= new Animal[4]; //UpCasting Animal by creating a object  
		
		a[0] = new Dog(); //Creating object of Dog and Store it in Animal reference type
		a[1] = new Cat();
		a[2] = new Dog();
		a[3] = new Cat();
		
		for(Animal n:a) {
			n.makesound();
			if(n instanceof Dog) {
				Dog D = (Dog)n;
				D.jump();
			}
		}
		
		
	}

}
