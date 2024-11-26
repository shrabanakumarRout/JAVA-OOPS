package HashsetDataStructure;

public class hashset {
	
	private node[] a= new node [10];
	private int count;
	
	public boolean add(int key) {
		int index = key % a.length;
		index= Math.abs(index);
		
		if (a[index] == null)
		{
			  a[index]  =new node(key,null);
			  count++;
			  return true;
		}
		
		node curr=a[index];
		node prev = null;
		
		while(curr!=null) {
			if(key == curr.key)return false;
			prev=curr;
			curr=curr.next;
		}
		prev.next=new node(key , null);
		count++;
		return true;
  	}
	public int size() {
		return count;
	}
	
	public void traverse() {
		for(int i=0;i<a.length;i++) {
			node curr=a[i];
			while(curr!=null) {
				System.out.print(curr.key+ " ");
				curr=curr.next;
			}
			System.out.println();
		}
	}
		public boolean isEmpty() {
			return count==0;
		}
}
