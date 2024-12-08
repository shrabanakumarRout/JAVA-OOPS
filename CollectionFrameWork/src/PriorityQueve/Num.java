package PriorityQueve;

import java.util.PriorityQueue;
import java.util.Queue;

public class Num {
  
	  public static void main (String []args) {
		  Queue<Integer> q = new PriorityQueue<Integer>(new DescComparator());
		  System.out.println(q.isEmpty());
		  
		  //Here we insert the value in the mixed error
		  q.add(10);
		  q.add(30);
		  q.add(20);
		  q.add(50);
		  q.add(40);
		  
		  System.out.println(q.peek());
		  System.out.println(q.isEmpty());
		  while(!q.isEmpty()) {
			  System.out.println(q.poll());
		  }
		  
	  }

}
