package collectionObjectsUsingList;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Test8 {

	public static void main(String[] args) {
		
		Collection c = new HashSet();
		c.add(1);
		c.add(2);
		c.add(3);
		
		
		Iterator itr = c.iterator();
		
		while(itr.hasNext()) {
		   int i = (Integer)itr.next();
		   if(i%2==0)itr.remove();
		}
       System.out.println(c);
	}

}
