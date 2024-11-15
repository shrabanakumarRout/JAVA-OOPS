package com.TwoDimArray;

public  class Circle implements Comparable {

	int radius;
	
	public Circle(int radius) {
		this.radius=radius;
	}
	public int compareTo(Object arg) {
		return this.radius=((Circle)arg).radius;
	}
	
	public String toString() {
		return "radius="+radius;
	}
}
