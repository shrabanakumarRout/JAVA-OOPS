package com.overriding;
class Bank {
	int Money() {
		return 0;
	}
}
class SBI extends Bank{
	@Override
	int Money() {
		System.out.println("interest rate = 5%");
		return 5;
	}
}
class ICICI extends SBI
{
	int Money() {
		return 8;
	}
}
public class Test3 {

	public static void main(String[] args) {
		SBI s1 = new SBI();
		s1.Money();

	}

}
