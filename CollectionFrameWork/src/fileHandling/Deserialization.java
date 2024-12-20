package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main (String []args) throws IOException,ClassNotFoundException {
		FileInputStream f = new FileInputStream("C:\\Users\\shrab\\OneDrive\\Documents\\Html-css-course\\Documents\\Desktop\\CJD-M18\\java.txt");
		try(ObjectInputStream of = new ObjectInputStream(f)){
			Student s = (Student)of.readObject();
			System.out.println(s);
			System.out.println("Describe Done");
			}
	}
}
