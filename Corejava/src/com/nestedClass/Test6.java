package com.nestedClass;

import java.util.Arrays;
import java.util.Comparator;

public class Test6 {

	public static void main(String[] args) {
		String [] a= {"java","c","angular","Spring"};
          
		Comparator c = new Comparator()
				{

					@Override
					public int compare(Object arg1, Object arg2) {
						// TODO Auto-generated method stub
						return ((String)arg1).length() - ((String)arg2).length();
					}
			
				};
				
				Arrays.sort(a,c);
				for(String s:a) {
					System.out.println(s);
				}
	
	}
}
