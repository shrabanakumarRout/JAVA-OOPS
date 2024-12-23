package com.PatternPrgms;

public class FlyodStn {

	public static void main(String[] args) {
		int n=5;
		int num =1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(j);
				num++;
			}
			System.out.println();
		}

	}

}
//1
//12
//123
//1234