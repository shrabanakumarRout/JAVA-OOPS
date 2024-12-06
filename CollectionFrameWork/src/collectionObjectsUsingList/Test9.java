package collectionObjectsUsingList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test9 {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		ListIterator listItr = l.listIterator();
		while (listItr.hasNext()){
			System.out.println(listItr.next());
		}
		
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		

	}

}
