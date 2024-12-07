package CFMapMethods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		Map m1 = new HashMap();
		m1.put(101,"Ram");
		m1.put(102,"Rohit");
		m1.put(103, "Sita");
		m1.put(104,"Disha");
		
		Set s = m1.keySet();
		System.out.println(s);
		Collection c = m1.values();
		System.out.println(c);

	}

}
