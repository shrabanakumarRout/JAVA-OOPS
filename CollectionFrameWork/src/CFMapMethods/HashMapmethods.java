package CFMapMethods;
import java.util.*;


public class HashMapmethods {

	public static void main(String[] args) {
		
	Map m1=new HashMap();
	
	m1.put(101,"Ram");
	m1.put(102,"Sita");
	m1.put(103,"Lakshman");
	m1.put(104,"Hanuman");
	
	System.out.println(m1);
	
	Map m2 = new HashMap();
	m2.put("abc",1010);
	m2.put("xyz",1122);
	
	System.out.println(m2);
	
	m1.putAll(m2);  //map inside another map but no insertion and sorting order
	System.out.println(m1);
	
	System.out.println(m1.get(103)); 
	System.out.println(m1.get(107));
	
	System.out.println(m1.containsKey(103));
	System.out.println(m1.containsKey(111));
	
	System.out.println(m1.containsValue("Rohit"));
	System.out.println(m1.containsValue("ram"));
	
	System.out.println(m1.size());
	
	m1.remove(103); //103 EntryRemoved
	System.out.println(m1);
	System.out.println(m1.size()); 
	
	m1.put(101,"Ramchandra"); //Replace the value of key 101 with RamChandra
	m1.put(105, "Rohit");
	System.out.println(m1);
	
	m1.put(null,"Rima");  //Only once accepted null as key
	System.out.println(m1);
	m1.put(null,"anita"); //null replace with anita
	m1.put(109,null);  //values can be null
	m1.put(111,null);
	System.out.println(m1);
	}

}
