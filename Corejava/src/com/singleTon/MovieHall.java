package com.singleTon;

public class MovieHall {
private int seats = 50;
private static MovieHall m = null;

private MovieHall() {// making Constructor Private
}

public void bookTicket(int n) {
	if(n<=seats) {
		seats = seats-n;
	System.out.println(n + "seats is booked");
	}else {
		System.out.println(n+"Seats is not Available");
	}
}
public static MovieHall getInst() {
	if(m == null) {
		m = new MovieHall();
		return m;
	} else {
		return m;
	}
}
public int getseats()
{
	return seats;
}
}
