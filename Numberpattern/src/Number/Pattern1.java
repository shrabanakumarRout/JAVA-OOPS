package Number;

public class Pattern1 {
public static void main(String [] args) {
	int n = 123456789;
	int count = 0;
	int esum = 0;
	int osum = 0;
	
	while (n>0) {
		int rem = n%10;
		 n/=10;
		count ++ ;
		
		if(count % 2 ==0){
			esum+=rem;
		}else {
			osum+=rem;
		}
	}
	System.out.println("esum = " + "" + esum);
	System.out.println("osum = "  + "" +osum);
}
}
