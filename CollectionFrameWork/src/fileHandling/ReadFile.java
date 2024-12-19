package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
	
		File file = new File("D:\\java\\welcome.java");
		FileInputStream f=new FileInputStream(file);
		if(file.canRead()) {
			int n = f.read();
			while(n != -1) {
				System.out.print((char)n);
				n= f.read();
				}
			
			}else
				System.out.println("cant read the data");
		f.close();

	}

}
