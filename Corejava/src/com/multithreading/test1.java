package com.multithreading;

public class test1 {

	public static void main(String[] args) {
		System.out.println("Main Strats");
		Thread t1 = new PrintNumsThread();
		t1.start();
		
		Thread t2 = new PrintAlphaThread();
		t2.start();
		System.out.println("main ends");

	}
}
	
	class PrintNumsThread extends Thread{
		public void run() {
			System.out.println("run() of printnums Starts");
			for(int i=1;i<=20;i++) {
				System.out.println(i);
				try{Thread.sleep(500);}catch(Exception e) {}
			}
			System.out.println("run() of printAlphaThread ends");
		}
	}

	
	class PrintAlphaThread extends Thread{
		
		public void run() {
			System.out.println("run() of printnums Starts");
			for(char c='a'; c<='z';c++) {
				System.out.println(c);
				try {
					Thread.sleep(500);
				}catch(Exception e) {
					
				}
				System.out.println("run() of PrintAlphaThread Ends");
			}
		}
	}

