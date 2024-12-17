package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\shrab\\OneDrive\\Documents\\Html-css-course\\Documents\\Desktop\\CJD-M18\\java.txt");
		FileWriter f = new FileWriter(file);
		if(file.canWrite())
			f.write("Jspiders" + "\n" + "Qspider");
		else
			System.out.println("can't write......");
		
		f.close();
		System.out.println("Executed");

	}

}
