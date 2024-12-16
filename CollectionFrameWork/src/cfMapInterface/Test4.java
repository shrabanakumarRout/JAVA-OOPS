package cfMapInterface;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test4 {

	public static void main(String[] args) {
			
			Map<Integer,String> m = new TreeMap<Integer,String>(); // CheckIt also With HasMap Interface
			
			m.put(7,"Thala");
			m.put(18,"Kohli");
			m.put(45,"Hitman");
			m.put(93,"Bumrah");
			m.put(1,"KL Rahul");
			
			Set<Entry<Integer,String>>e=m.entrySet();
			for(Entry<Integer,String>en:e) {
				System.out.println(en);
			}

	}

}
