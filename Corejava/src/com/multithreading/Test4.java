package com.multithreading;

public class Test4 {

	public static void main(String[] args) {
		
		
		new UpdateThread(25);
		try {Thread.sleep(3000);}catch (Exception e) {}
		
		new ConsumeThread(30);
		try {Thread.sleep(4000);}catch(Exception e) {}
		
		new UpdateThread(25);
		try {Thread.sleep(4000);}catch(Exception e) {}

	}

}
