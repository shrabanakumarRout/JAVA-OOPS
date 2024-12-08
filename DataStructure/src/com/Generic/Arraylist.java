package com.Generic;

public class Arraylist <E>{

	private Object []a;
	private int pos;
	
	public Arraylist() {
		a=new Object[5];
		pos=0;
	}
	
	public boolean add(E e) {
		if(pos>a.length)increase();
		a[pos++]=e;
		
		return true;
		
		}
	
	public void increase() {
		Object[]temp = new Object [a.length+3];
		System.arraycopy(a,0,temp,0,a.length);
	}
	
	
	public int size() {
		return pos;
	}
	
	
	public boolean isEmpty() {
		return pos == 0;
	}
	
	
	public boolean add(E e,int index) {
		if(index<=-1 || index>=size()) {
			throw new IndexOutOfBoundsException("Out of Index");
		}
		if(pos>=a.length)increase();
		for(int i=size()-1;i>=index;i--) {
			a[i+1]=a[i];
		}
		
		a[index]=e;
		pos++;
		return  true;
	}
	
	public E get(int index) {
		if (pos==0) {
			throw new IndexOutOfBoundsException();
		}
		return (E)a[index];
	}
	
	public void travesrse() {
		for(int i=0;i<size();i++) {
			System.out.println(a[i]);
		}
	}
}


