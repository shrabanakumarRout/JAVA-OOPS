package com.JspArraypgms;

public class CircleValue {

	public static void main(String[] args) {
		     Circle[] arr  =new Circle[4];
		     arr[0]=new Circle(50);
		     arr[1]=new Circle(10);
		     arr[2]=new Circle(20);
		     arr[3]=new Circle(30);
		     
		for(Circle c:arr) {
			System.out.println(c);
		}

	}

}
