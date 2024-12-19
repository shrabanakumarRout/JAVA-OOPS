 package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\shrab\\OneDrive\\Documents\\Html-css-course\\Documents\\Desktop\\CJD-M18\\java.txt");
		FileOutputStream f = new FileOutputStream(file);
	//	f.write("Jspiders"); You need to convert the String into a byte array using the getBytes() method before writing it to the file.
		
		
		 String s = "PYSpiders"; 
		 byte[]b=s.getBytes(); //The getBytes() method converts the String into a byte array, which is accepted by the write() method.
		 
		 if(file.canWrite())
			 f.write(b);
		 else
			 System.out.println("cant write the data into file");
		 f.close();
		
		
		

	}

}
