package com.multithreading;

public class Account {
	private int bal=1000;
	synchronized void deposit(int a) {
		int currBal=bal;
		int newBal=currBal+a;
		try {
			Thread.sleep(500);
		}catch(Exception e) {}
		bal = newBal;
		System.out.println(a+ " rs Deposited");
		
	}
		synchronized void display() {
			System.out.println("bal = "+bal);
	}

}
