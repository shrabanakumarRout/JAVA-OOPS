package com.singleTon;

public class Bookmyshow {

	public static void main(String[] args) {
		MovieHall user1 = MovieHall.getInst();
		user1.bookTicket(40);
		MovieHall user2 = MovieHall.getInst();
		user2.bookTicket(10);
		
		//System.out.println(user1.getInst());
		//System.out.println(user2.getInst());

	}

}
