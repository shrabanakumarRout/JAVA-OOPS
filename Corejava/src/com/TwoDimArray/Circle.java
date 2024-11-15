package com.TwoDimArray;

public  class Circle implements Comparable {

	int radius;
	
	public Circle(int radius) {
		this.radius=radius;
	}
	public int compareTo(Object a) {
		return this.radius-((Circle)a).radius;
	}
	@Override
	public String toString() {
		return "radius="+radius;
	}
}
