package com.encapsulation;
class Student {
 private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
 class test10{
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Simpul");
		String n = s1.getName();
		System.out.println("name" + n);

	}

	

}
