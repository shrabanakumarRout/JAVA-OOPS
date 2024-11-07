package com.overriding;
class Animall{
	
}
class Dogs extends Animall{
	
}
class BabyDogs extends Dogs
{
	
}

class AA{
	Animall m1() {
		System.out.println("m1-AA");
		return new Animall();
		}
}

class BB extends AA{
	@Override
	protected  Dogs m1() {
		//Dog is a co-variant type for Animal.
		System.out.println("D1-AA");
		return new Dogs();
		}
}

class CC extends BB{
	@Override
	public BabyDogs m1() {
		//BabyDog type is a co- variant type for dog and animal.
		System.out.println("B1-AA");
		return new BabyDogs();
	}
}

public class Test5 {

	public static void main(String[] args) {
		BB d1 = new BB();
		d1.m1();
		CC c1 = new CC();
		c1.m1();
	}

}
