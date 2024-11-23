package queveInDatastructure;

public class TestLinkedlist {

	public static void main(String[] args) {
		Linkedlist l = new Linkedlist();
		l.add("Simpul");
		l.add("Pinu");
		l.add("Subhangi");
		l.add("Santunu");
		l.add("Papul");
		
		System.out.println(l.size());
		System.out.println(l.poll());
		System.out.println(l.peak());
		

	}

}
