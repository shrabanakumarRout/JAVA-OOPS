package com.starpatern;

public class Pattern10 {

	public static void main(String[] args) {
		int n =6;
		for(int i=n;i>=1;i--) {
			for(int j=i;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
