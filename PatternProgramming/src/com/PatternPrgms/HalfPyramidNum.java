package com.PatternPrgms;

public class HalfPyramidNum {

	public static void main(String[] args) {
		int a = 5;
		
		for(int i=a;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
//12345
//1234
//123
//12
//1
