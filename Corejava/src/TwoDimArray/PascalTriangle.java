package TwoDimArray;

public class PascalTriangle {                         /*       1 
                                                              1 1 
                                                             1 2 1 
                                                            1 3 3 1 
                                                           1 4 6 4 1 */ 


	public static void main(String[] args) {
	
		int n= 5;
		int [][]a = new int [n][];
		ispascal(a);
		int sp=n-1;
		for(int []num:a) {
			for(int j=1;j<=sp;j++)
				System.out.print(" ");
			for(int arr:num) {
				System.out.print(arr+ " ");
			}
			System.out.println();
			sp--;
		}
		
	}
	
	
	public static int [][] ispascal(int [][]a) {
		for(int i=0;i<a.length;i++) {
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++) {
				if(j==0 || i==j)
					a[i][j]=1;
				else
					a[i][j]=a[i-1][j-1]+a[i-1][j];
			}
		}
		return a;
	}

}
