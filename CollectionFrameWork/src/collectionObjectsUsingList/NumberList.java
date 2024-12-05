package collectionObjectsUsingList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NumberList {

	public static void main(String[] args) {
		List l = new ArrayList();
		
		l.add(80);
		l.add(40);
		l.add(20);
		l.add(30);
		l.add(50);
		
		System.out.println(l);  //Before Sort
		Collections.sort(l);
		System.out.println(l);  //After Sort
		System.out.println(l.getFirst());
		System.out.println(l.getLast());

	}

}
