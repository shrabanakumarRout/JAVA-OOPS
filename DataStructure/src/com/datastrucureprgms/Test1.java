package com.datastrucureprgms;

public class Test1 {

	public static void main(String[] args) {
		
              node first = null;
              first=new node(10);  
              first.next=new node(20);
              first.next.next=new node(30);
              first.next.next.next=new node(40);
              
              
              node curr=first;
              while( curr != null) {
            	  System.out.println(curr.ele);
            	  curr = curr.next;
              
             
              
              }
	}
        

}
