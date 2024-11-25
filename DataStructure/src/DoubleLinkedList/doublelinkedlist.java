package DoubleLinkedList;

public class doublelinkedlist {
               private node first;
               private int count;
               
               public void add(Object e) {
            	   if(first==null) {
            	   first=new node(e);
                   count++;
                   return;
            	   }
            	   node curr=first;
            	   while(curr.next!=null) {
            		   curr=curr.next;
            	   }
            	   curr.next=new node(e,curr,null);
            	   count++;
            	   return;
               }
               
               public int size() {
            	   return count;
               }
               
               public Object get(int index) {
            	   if(index<= -1 || index>size()) {
            		   throw new IndexOutOfBoundsException();
            	   }
            	   node curr=first;
            	   for(int i=1;i<index;i++) {
            		   curr=curr.next;
            	   }
            	   return curr.next.ele;
            	   
               }
}
