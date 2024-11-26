package HashsetDataStructure;

public class User {

	public static void main(String[] args) {
		   hashset h = new hashset();
		   
		   h.add(10);
		   h.add(11);
		   h.add(12);
		   h.add(13);
		   h.add(14);
		   h.add(15);
		   h.add(16);
		   h.add(10);
		   h.add(22);
		   
		   
		   h.traverse();
		   System.out.println(h.size());
	}

}
