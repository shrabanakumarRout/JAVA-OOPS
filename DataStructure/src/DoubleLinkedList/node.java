package DoubleLinkedList;

public class node {
         Object ele;
         node prev;
         node next;
         
         public node(Object e) {
        	 this.ele=e;
         }
         
         public node(Object e,node p,node n) {
        	 this.ele=e;
        	 this.prev=p;
        	 this.next=n;
         }
}
