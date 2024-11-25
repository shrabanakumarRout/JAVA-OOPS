package stackinDatastructure;

public class Linkedlist {
            node head;
            int count;
            
            public void push(Object e) {
            	if(head==null) {
            		head=new node(e);
            		count++;
            		return;
            	}
            	          head=new node(e,head); //then head will be updated to next node
            	          count++;
            	          
            }
            
            public int size() {
            	return count;
            }
            
            public boolean isempty() {
            	return count==0;
            	}
            public Object peek() {
            	if(head==null) {
            		throw new NullPointerException();
            	}
            	return head.ele;
            }
            
            public Object  pop() {
            	if(head==null) {
            		throw new NullPointerException();
            	}
                   node temp=head;
                   head=head.next;
                   count--;
                   return temp;
            }
            
            public void get() {
            	node temp=head;
            	while( temp != null) {
            		System.out.println(temp.ele);
            		temp=temp.next;
            	}	
            }
            
}
