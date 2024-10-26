package com.objectclass;

public class B {
         int i;
         int j;
	public B(int i,int j) {
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "B [i=" + i + ", j=" + j + "]";
	}
	@Override
	public boolean equals (Object o) { //Compare the values of variable that create in the object reference;
		B b = (B)o;   // Downcasting
		return this.i == b.i && this.j == b.j;
	}
}
