package com.datastrucureprgms;

public class ArrayTest {

	public static void main(String[] args) {
		Arraylist l = new Arraylist();
		l.add("Shrabana Kumar Rout");
        l.add("Subhangi Baliyarsingh");
        l.add("Soumitra jena");
        l.add("Swadhin Kumar Rout");
        l.add("Santunu Barik");
        l.add("Satyaprajna Bimlesh");
        //l.adding(2,70);
        
     // System.out.println(l.remove(2));
      
     for(int i=0;i<l.size();i++) {
    	  System.out.println((String)l.get(i));
      }
     l.remove(3);
     System.out.println("----------");
     for(int i=0;i<l.size();i++) {
    	 System.out.println((String)l.get(i));
    	 }
        
       
      
        
        
	}
	

}
