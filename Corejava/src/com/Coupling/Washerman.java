package com.Coupling;
interface washable{
	
}
class car implements washable{
	
}

class laptop{
	
}

class bike implements washable{
	
}

class mobile{
	
}


class garage{
	public static void wash(Object o) {
		if(o instanceof washable) {
			System.out.println(o.getClass().getSimpleName() +" "+"is washed");
		} else {
			System.out.println(o.getClass().getSimpleName() +" " +"Not Washed");
		}
	}
}
public class Washerman {

	public static void main(String[] args) {
		garage.wash(new car());
		garage.wash(new laptop());
		garage.wash(new bike());
		garage.wash(new mobile());

	}

}