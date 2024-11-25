package com.datastrucureprgms;

public class LinkedList {
	private node first;
	private int count;
	
	public void add(Object e) {
		if(first == null) {
			   first=new node(e);
			   count++;
			   return ;
			   
		}
		node curr =first;
		while(curr != null) {
			curr=curr.next;
			
		}
		      curr.next=new node(e);
		      count++;	
	}
	
	public int size() {
		return count;
	}
	
	
	public void addIndex(int index,Object e) {
		if(index<= -1 || index>size()) {
			throw new IndexOutOfBoundsException();
		}
	
		if(index==0) {
			  first=new node(e);
			  count++;
			  return;
		}
		
		node curr = first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=new node(e,curr.next);
		count++;
		
	}
	
	public Object get(int index) {
		if(index<= -1 || index>size()) {
			throw new IndexOutOfBoundsException();
		}
		  node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		return curr.ele;
	}
	
	public void remove(int index) {
		if(index<= -1 || index>size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=first.next;
			count--;
			return;
		}
		node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
	}
}
