package com.JspArraypgms;

public class SecHighest {

	public static void main(String[] args) {
		int a[]= {12,34,68,86,77};
		
		int high = a[0];
		int sechigh = a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]==high)continue;
			if(a[i]>high) {
				 sechigh=high;
				 high=a[i];
			}
			
			else if(a[i]>sechigh ||high==sechigh) {
				sechigh=a[i];
			}
		}
		
		System.out.println(sechigh);

	}

}
