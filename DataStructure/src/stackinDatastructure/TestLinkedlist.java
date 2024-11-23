package stackinDatastructure;

public class TestLinkedlist {

	public static void main(String[] args) {
		Linkedlist l = new Linkedlist();
		l.push(10);
		l.push(20);
		l.push(30);
		l.push(40);
		l.push(50);
		l.get();
		
         System.out.println(l.size());
         System.out.println(l.isempty());
         System.out.println(l.peek());
		
         System.out.println("-----------------------------------------");
         
         System.out.println(l.pop());
         l.get();
         System.out.println(l.size());
         System.out.println(l.peek());
		
	}

}
