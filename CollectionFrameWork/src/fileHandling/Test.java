package fileHandling;

@FunctionalInterface
interface I1{
	void m1(int i);
}
public class Test {

	public static void main(String[] args) {
		I1 i1 = i -> System.out.println(i*i); // Implementing lambda EXpression
		i1.m1(5);

	}

}
