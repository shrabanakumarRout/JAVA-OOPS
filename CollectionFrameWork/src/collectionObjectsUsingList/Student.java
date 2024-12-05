package collectionObjectsUsingList;

public class Student implements Comparable<Student>{
	
	String name;
	int rollno;
	double mark;
	
	
	public Student(String name, int rollno, double mark) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", mark=" + mark + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.rollno-rollno;
	}

	

}
