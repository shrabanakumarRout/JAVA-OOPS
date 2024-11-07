package com.objectclass;

public class Student {
          String name;
          int age;
          int id;
          long mobile;
          public Student(String name,int age,int id,long mobile)
          {
        	 this.name = name;
        	 this.age = age;
        	 this.id = id;
        	 this.mobile = mobile;
          }
         
	@Override
		public String toString()
	    {
			return "Student [name=" + name + ", age=" + age + ", id=" + id + ", mobile=" + mobile + "]";
		}

	public static void main(String[] args)
	{
		Student s1 = new Student("Simpul",22,1,987654321);
        System.out.println(s1);
	}

}
