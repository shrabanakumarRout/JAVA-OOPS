package com.multithreading;

public class Stock {
	private int items;
	private static Stock Obj = null;
	
	private Stock() {
		
	}
	
	public static Stock getInstance() {
		if(Obj == null)
			Obj = new Stock();
		return Obj;
		
	}
	
	synchronized public void update(int n) {
		items = items+n;
		System.out.println("Stock is Updated to "+items+" Stock");
		notifyAll();
	}
	
	
	
	synchronized public void Consume(int n) {
		System.out.println("Consumers Requiers "+ n +" items");
		while(items<n) {
			System.out.println("Waiting for Update");
		
		try {wait();} catch(Exception e) {e.printStackTrace();}
		}
		items-=n;
		System.out.println(n+"items are Consumed");
	}
}
	

