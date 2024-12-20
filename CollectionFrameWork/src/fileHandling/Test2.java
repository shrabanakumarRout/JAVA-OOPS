package fileHandling;

@FunctionalInterface
interface I2{
	int m1(int i,int j);
}

public class Test2 {

	public static void main(String[] args) {
		I2 i1= (i,j) -> {return i+j;};
		int res = i1.m1(10, 20);
		System.out.println(res);	
	}

}
