package fileHandling;

import java.io.Serializable;

public class Student implements Serializable{
	String name;
	int age;
	int id;
	long mobile;
	public Student(String name, int age, int id, long mobile) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", id=" + id + ", mobile=" + mobile + "]";
	}
	
	

}
