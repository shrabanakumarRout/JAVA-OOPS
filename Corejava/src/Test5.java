class A{
	void m1() {
		System.out.println("m1-A");
	}
}
 final class B extends A {
	void m1() {
		System.out.println("m1-B");
	}
}

public class Test5 {

	public static void main(String[] args) {
		B b1 = new B();
		b1.m1();
		A a1 = new A();
		a1.m1();

	}

}
