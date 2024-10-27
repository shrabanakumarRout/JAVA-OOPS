package com.JspStringPrgms;
import java.util.Scanner;
public class StringCountDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String"); //java123developer
		 String name= sc.nextLine();
		int count = 0;
		for(int i = 0;i<=name.length()-1;i++) {
			char c=name.charAt(i); //local variable declare for store the index position of the String (charAt(0));
			if(count(c)) { //calling the count method
				count++;
				}
			}
		System.out.println(count);
		}
	
	
	
	public static  boolean count(char a) {
		return a=='0'||a=='1'||a=='2'||a=='3'||a=='4'||a=='5'||a=='6'||a=='7'||a=='8'||a=='9';
	}

}
