package com.multithreading;

public class test2 {

	public static void main(String[] args) {
		Account a1 = new Account();
		
		
		new DepositThread(a1,1000);
		
		new DepositThread(a1,1000);
		try {
			Thread.sleep(5000);
		}catch(Exception e) {}
          a1.display();
	}

}
