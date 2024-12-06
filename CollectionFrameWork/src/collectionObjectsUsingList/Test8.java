package collectionObjectsUsingList;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Test8 {

	public static void main(String[] args) {
		
		Collection c = new HashSet();
		c.add(10);
		c.add(20);
		c.add(30);
		
		
		Iterator itr = c.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
