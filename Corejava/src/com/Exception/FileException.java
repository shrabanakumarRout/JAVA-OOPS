package com.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileException {

	public static void main(String[] args) {
		System.out.println("main Executed");
		try {
			m1();
		}catch(FileNotFoundException e) {
			//Handle the exception
			System.out.println("FileNotFoundException occured: " + e.getMessage());
		}
	
	}
	
	
	
	private static void m1() throws FileNotFoundException {
		System.out.println("m1 Executed");
		m2();
	}
	
	private static void m2() throws FileNotFoundException{
		System.out.println("m2 Executed");
		
		FileReader r = new FileReader("C:\\Users\\shrab\\eclipse-workspace\\Corejava\\src\\com\\Exception");
		System.out.println("File opened SuccessFully");
	}

}
