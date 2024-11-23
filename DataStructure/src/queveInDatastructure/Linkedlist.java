package queveInDatastructure;

public class Linkedlist {
      node head;
      int count;
      
      
      public void add(Object ele) {
    	  if(head == null) {
    		  head=new node(ele);
    		  count++;
    		  return;
    	  }
    	  
    	   head.next=new node(ele);
    	   count++;
      }
      
      public int size() {
    	  return count;
      }
      
      public Object poll() {
    	  if(head==null) {
    		  throw new NullPointerException();
    	  }
    	    Object  ele =head.ele;
    	    head = head.next;
    	    count--;
    	    return ele;
      }
      
      public boolean isempty() {
    	  return count==0;
      }
      
      public Object peak() {
    	  if(head==null) {
    		  throw new NullPointerException();
    	  }
    	  return head.ele;
      }
}
