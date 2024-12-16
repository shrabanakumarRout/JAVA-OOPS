package cfMapInterface;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test3 {

	public static void main(String[] args) {
		
		Map<Integer,String> m = new TreeMap<Integer,String>(); //Check it also With HasMap Interface
		
		m.put(7,"Thala");
		m.put(18,"Kohli");
		m.put(45,"Hitman");
		m.put(93,"Bumrah");
		m.put(1,"KL Rahul");
		
		Set<Integer> s = m.keySet();
		
		Iterator <Integer> i = s.iterator();
		while(i.hasNext()) {
			int key=i.next();
			String res = m.get(key);
		
			System.out.println(key + " "+ res);	
			}
		}
	}


