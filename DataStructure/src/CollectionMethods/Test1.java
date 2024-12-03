package CollectionMethods;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
           // System.out.println(a); //Create a Empty Array.
            a.add(10);
            a.add(20);
            a.add(30);
            System.out.println("a = "+a);
            
           ArrayList b=new ArrayList();
           b.add(40);
           b.add(50);
           System.out.println("b = "+b);
           b.addAll(a);
           System.out.println("b = "+ b);
           System.out.println("b is superset of a = "+b.containsAll(a)); //(Collection e)
           System.out.println("b is superset of a = "+b.contains(a));
            b.retainAll(a);
            System.out.println("b = "+b);
//            Object [] arr = a.toArray();
//            for(Object O !arr) {
//            	System.out.println(O);
            }
	}


