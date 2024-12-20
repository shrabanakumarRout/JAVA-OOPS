package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException {
		Student s1 = new Student("Simpul",24,1,987654321);
		FileOutputStream f = new FileOutputStream("C:\\Users\\shrab\\OneDrive\\Documents\\Html-css-course\\Documents\\Desktop\\CJD-M18\\java.txt");
        try(ObjectOutputStream of = new ObjectOutputStream(f)){
        	of.writeObject(s1);
        	System.out.println("Serialization Done");
        }
	}

}
