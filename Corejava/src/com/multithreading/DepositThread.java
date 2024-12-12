package com.multithreading;

public class DepositThread implements Runnable{
	Account acc;
	int amt;
	
	DepositThread(Account acc,int amt){
		this.acc=acc;
		this.amt=amt;
		new Thread(this).start();
	}

	@Override
	public void run() {
		acc.deposit(amt);
		
	}

}
