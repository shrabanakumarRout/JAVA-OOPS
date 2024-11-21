package com.datastrucureprgms;

public class node {
	Object ele;
	node next;
	
	public node(Object e) {
		this.ele=e;
		next = null;
	}
	
	public node(Object e,node n) {
		ele =e;
		next=n;
	}
	
}
