package queveInDatastructure;

public class ArrayList {
		private Object [] a;
		private int count;
	public  ArrayList() {
		a=new Object[5];
	}

	
	
	public void add(Object ele) {
		if(count>= a.length)increase();
		a[count++]=ele;
	}
	
	public void increase() {
		Object Temp[]=new Object[a.length+3];
		System.arraycopy(a, 0, Temp, 0, a.length);
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
		if(count == 0) return null;
		return a[0];
	}
	
	public Object poll() {
		if(count == 0)return null;
		Object Temp=a[0];
		for(int i =0;i<count;i++) {
			a[i]=a[i+1];
		}
		a[--count] =null;
		return  Temp;
	}
}


