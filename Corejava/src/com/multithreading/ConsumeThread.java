package com.multithreading;

public class ConsumeThread implements Runnable {
	int items;
	
	public ConsumeThread(int items) {
		this.items=items;
		new Thread(this).start();
	}

	@Override
	public void run() {
		
		System.out.println("Consume thread Starts");
		Stock.getInstance().Consume(items);
	}

}
