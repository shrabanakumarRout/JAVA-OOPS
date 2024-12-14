package com.multithreading;

public class UpdateThread implements Runnable{
	int items;
	
	public UpdateThread(int items) {
		this.items=items;
		new Thread(this).start();
	}
	@Override
	public void run() {
		System.out.println("Update Thread Starts");
		Stock.getInstance().update(items);
		
	}	
}
