package stackinDatastructure;

public class ArrayList {
	private Object[]a;
	private int count;
	Object peak;
	
	public  ArrayList() {
		a= new Object[5];
		count=0;
	}
	
	public void push(Object ele) {
		if(count>=a.length) increase();
		a[count++]=ele;
	}
	
	
	public void increase() {
		Object  Temp[]=new Object[a.length+3];
		System.arraycopy(a, 0, Temp, 0,a.length);
		a=Temp;
	}
	
	public void get() {
		for(int i=0;i<size();i++) {
			System.out.println(a[i]);
		}
	}
	
	public int size() {
		return count;
	}
	
	public Object peek() {
		if(count == 0)return null;
		return a[0];
	}
	
	public Object pop() throws Exception{
		if(count==0) throw new Exception("stack is Empty");
		Object temp = a[--count];
		a[count]=null;
		return temp;
	}

}
