package com.TwoDimArray;

public class NumtoWord {

	public static void main(String[] args) {
		int num=24764345;
		toword(num/10000000," crore");
		toword((num / 100000)%100,"lakhs");
        toword((num/1000)%100,"thousand");
        toword((num/100)%10,"hundread");
        toword(num%100,"");
	}
	
	public static void toword(int num ,String s) {
		String []one= {" ","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fiveteen","sixteen","seventeen","eighteen","nineteen"};
		
		String []two= {" "," ","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
		
		if(num<=19) {
			System.out.print(one[num]);
		}
		else {
			System.out.print(two[num/10]+""+one[num%10]);
		}
		if(num!=0)
		System.out.print(s);
	}
	
	

}
