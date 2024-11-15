package com.TwoDimArray;

import java.util.Arrays;

public class Inputforcircle {

	public static void main(String[] args) {
		Circle []arr= {
				new Circle(40),
				new Circle(10),
				new Circle(20),
				new Circle(50)
		};
		Arrays.sort(arr);
		
		for(Circle c:arr) {
			System.out.println(c);
		}

	}

}
