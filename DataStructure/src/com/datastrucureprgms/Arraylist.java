package com.datastrucureprgms;

public class Arraylist {
	   private Object[]a;
	   private int pos=0;
	   public Arraylist() {
		    a= new Object[5];
		    pos=0;
		   
	   }
	   
	   public String add(Object o) {
		   if(pos>=a.length) {
			   Object[]temp=new Object[a.length+3];
			   System.arraycopy(a, 0, temp, 0, a.length);
			   a=temp;
		   }
		   a[pos++]=o;
		   
		   return "Added SuccessFully " +o;
	   }
	  

}
