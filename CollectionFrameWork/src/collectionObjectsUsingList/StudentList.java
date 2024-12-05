package collectionObjectsUsingList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudentList {

	public static void main(String[] args) {
		Student s1 = new Student("Simpul",1,43);
		Student s2 = new Student("pinu",2,49);
		Student s3 = new Student("Subhangi",3,48);
	
   List l = new LinkedList<Student>();
   
   l.add(s1);
	l.add(s2);
	l.add(s3);
	System.out.println(l);
	Collections.sort(l, new NameComparator());
	System.out.println(l);
	System.out.println(l.get(0).getClass().getSimpleName());

	}  
}
