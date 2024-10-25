package Number;
import java.util.Scanner;
public class SttrongNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no");
		int n = sc.nextInt();
		int temp = n;
		int sum=0;
		while(n>0) {
			int fact=1;
			int rem = n%10;
			for(int i = 1;i<=rem;i++) {
				fact*=i;
			}
				sum+=fact;
				n/=10;
			
		}if(sum == temp) {
			System.out.println(temp+ " = is a Strong number");
		}else {
			System.out.println(temp+" = is not a Strong number");
		}
	}

}
