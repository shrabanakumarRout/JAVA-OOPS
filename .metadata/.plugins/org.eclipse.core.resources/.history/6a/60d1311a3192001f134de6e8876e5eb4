package com.starpatern;
import java.util.Scanner;
public class Pattern6 {
public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the range");
	int n = sc.nextInt();
	int star = 1;
	int Space = n/2;
	for(int i = 1;i<=n;i++) {
		for(int j = 1;j<=Space;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++) {
			if(j==1 || j==star) {
				System.out.print("*");		
				}else {
					System.out.print(" ");
				}
		}
		System.out.println();
		if(i<=n/2) {
			Space--;
			star+=2;
		}else {
		Space++;
		star-=2;
		}
	}
}
}
