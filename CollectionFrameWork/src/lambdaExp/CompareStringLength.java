package lambdaExp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CompareStringLength {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Amearan","maran","aran","ran","ra","ramana","raman");
		Predicate<String> p=i->i.length()>=5;
		for(String s:list) {
			if(p.test(s))
				System.out.println(s);
		}
		
	}

}
