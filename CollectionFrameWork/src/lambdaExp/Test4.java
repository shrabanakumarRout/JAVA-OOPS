package lambdaExp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test4 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Amearan","maran","aran","ran","ra","ramana","raman");
		Function<String,Integer> fn = str-> str.length();
		
		
		 list.forEach(n -> System.out.println(fn.apply(n)));
	}

}
