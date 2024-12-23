package com.PatternPrgms;

public class RevOddstar {

	public static void main(String[] args) {
		int n =7;
		int space = 0;
		int star = n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("X");
			}
			System.out.println();
			space++;
			star-=2;
		}

	}

}

//XXXXXXX
// XXXXX
//  XXX
//   X
