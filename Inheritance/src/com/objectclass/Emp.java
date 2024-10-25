package com.objectclass;

public class Emp {
	String name;
	int age;
	String address;
	
	public Emp(String name,int age,String address) {
		this.name = name;
		this.age= age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	@Override
	public boolean equals (Object o) {
		Emp e1 = (Emp)o;
		return this.name.equals(e1.name) && this.age == e1.age && this.address.equals(e1.address);
	}

}
