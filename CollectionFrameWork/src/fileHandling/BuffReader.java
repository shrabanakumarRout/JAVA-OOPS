package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuffReader {

	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("D:\\java\\welcome.java");
		BufferedReader bf = new BufferedReader(f);
		String s = bf.readLine();
		int count = 0;
		
		while(s!= null) {
			System.out.println(s);
			s = bf.readLine();	
		}
		System.out.println(count);
		bf.close();

	}

}
