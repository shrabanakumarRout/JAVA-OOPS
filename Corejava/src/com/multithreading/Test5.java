package com.multithreading; 
public class Test5 {

	public static void main(String[] args) {
		Thread t1=new Thread(new A());
		t1.setDaemon(true);
		t1.start();
		
		for(char c='A';c <='Z'; c++) {
			System.out.println(c);
			try {Thread.sleep(200);} catch(Exception e) {
				e.printStackTrace();}
			}
		}

	}






class A implements Runnable
{
	public void run() {
		int i = 1;
		while(true) {
			System.out.println(i);
			try {Thread.sleep(3000);}catch(Exception e) {e.printStackTrace();}
			i++;
		}
	}
}
