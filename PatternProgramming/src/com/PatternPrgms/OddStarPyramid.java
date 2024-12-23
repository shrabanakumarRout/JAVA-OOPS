package com.PatternPrgms;

public class OddStarPyramid {

	public static void main(String[] args) {
		int n = 5;
		int star = 1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("X");
			}
			System.out.println();
			star+=2;
		}
	}
}
//    X
//   XXX
//  XXXXX
// XXXXXXX
//XXXXXXXXX

