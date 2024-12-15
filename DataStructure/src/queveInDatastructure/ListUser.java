package queveInDatastructure;

public class ListUser {

	public static void main(String[] args) {
		
		ArrayList q = new ArrayList();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.get();
		System.out.println("---------------------before----------------------");
		q.poll();
		System.out.println("------------------------after------------------");
		q.get();
		System.out.println("-------------------------peek");
		System.out.println(q.peek());

	}

}
