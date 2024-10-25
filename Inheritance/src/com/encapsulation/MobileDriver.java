package com.encapsulation;

import java.util.Scanner;

public class MobileDriver {

	public static void main(String[] args) {
		boolean r = true;
		Mobile m = null;
Scanner sc = new Scanner (System.in);
do {
	System.out.println("1.Add\n2.display\n3.price\n4.change color\n5.exit");
	int n = sc.nextInt();
	switch(n) {
	case 1:{
		System.out.println("Enter mobile Name");
		String name = sc.next();
		System.out.println("Enter mobile colour");
		String colour = sc.next();
		System.out.println("Enter mobile ram");
		int ram = sc.nextInt();
		System.out.println("Enter mobile rom");
	    int rom = sc.nextInt();
		System.out.println("Enter mobile price");
		int price = sc.nextInt();
		m = new Mobile(name,colour,ram,rom,price);
		}break;
	case 2:{
		if(m!= null)
			m.Display();
		else {
			System.out.println("NO mobile Added");
		}
	}break;
		case 3:{
			if (m!= null) {
			System.out.println(m.getprice());
			}else {
				System.out.println("No Mobile Added");
			}
			}break;
			 
	     case 4:{
			    if(m!=null)
			    System.out.println("Enter new colour:");
			    String color=sc.next();
			    System.out.println("old colour:" + m.getcolour());
			    m.setcolour(color);
			    System.out.println("new  colour:" + m.getcolour());
	     }
			    
			    case 5:{
			    	r=false;
			    }
		}
}
	while(r);

	}
	}

	

	


	


