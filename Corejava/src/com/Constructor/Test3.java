package com.Constructor;
class Student{
	String name;
	int age;
	long mobile;
	
	Student(String name,int age,long mobile){
		this.name = name;
		this.age = age;
	    this.mobile=mobile;
	}
	
	
	Student(Student s){  
		this.name=s.name;
		this.age = s.age;
		this.mobile=s.mobile;
	}
	
	void Display() {
		System.out.println(name+ " " + age+" "+mobile);
	}
}
public class Test3 {

	public static void main(String[] args) {
		Student s = new Student("Ram",22,987654321);
		Student s1 = new Student(s);  //copy constructor used to copy the values from one object to another object;
		//s1.name=("Santunu");
		
		s.Display();
		s1.Display();

	}
}
