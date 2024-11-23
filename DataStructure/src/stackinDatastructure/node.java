package stackinDatastructure;

public class node {

	Object ele;
	node next;
	
	public node(Object ele) {
		this.ele=ele;
	}
	
	public node(Object e,node next) {
		this.ele=e;
		this.next=next;
	}
	
}
