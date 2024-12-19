package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class TransferData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f=new FileInputStream("D:\\java\\welcome.java");
		FileWriter fr = new FileWriter("C:\\Users\\shrab\\OneDrive\\Documents\\Html-css-course\\Documents\\Desktop\\CJD-M18\\java.txt");
		int n =f.read();
		while(n != -1) {
			fr.write((char)n);
			n = f.read();
			
			}
		f.close();
		fr.close();

	}

}
