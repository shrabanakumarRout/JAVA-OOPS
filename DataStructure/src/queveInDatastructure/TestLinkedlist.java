package queveInDatastructure;

public class TestLinkedlist {

	public static void main(String[] args) {
		Linkedlist l = new Linkedlist();
		l.push("Simpul");
		l.push("Pinu");
		l.push("Subhangi");
		l.push("Santunu");
		l.push("Papul");
		
		System.out.println(l.size());
		System.out.println(l.poll());
		System.out.println(l.peak());
		

	}

}
