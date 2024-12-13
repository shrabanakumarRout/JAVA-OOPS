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
	
	public void update(int n) {
		items = items+n;
		System.out.println("Stock is Updated to "+items+" Stock");
	}
	public void Consume(int n) {
		System.out.println("Consumers Requiers "+ n +" items");
		while(items<n) {
			System.out.println("Waiting for Update");
		}
		items-=n;
		System.out.println(n+"items are Consumed");
	}
  
}
