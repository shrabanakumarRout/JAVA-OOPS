package com.TwoDimArray;

import java.util.Arrays;

public class circledriver {

	public static void main(String[] args) {
                   Circle [] a= {
                		             new Circle(40),
                		             new Circle(10),
                		             new Circle(50),
                		             new Circle(20),
                		             
                               };
                   
                   Arrays.sort(a);
                   
                   for(Circle c:a) {
                	   System.out.println(c);
                   }
                   
	}

}
