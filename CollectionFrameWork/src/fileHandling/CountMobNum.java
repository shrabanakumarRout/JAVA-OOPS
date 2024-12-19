package fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountMobNum {

	public static void main(String[] args) throws IOException {
		FileReader fr =new FileReader("C:\\Users\\shrab\\OneDrive\\Documents\\Html-css-course\\Documents\\Desktop\\CJD-M18\\java.txt");
		BufferedReader bf = new BufferedReader(fr);
		int count = 0;
		String exp = "[9876][0-9]{9}";
		Pattern p = Pattern.compile(exp);
		String s = bf.readLine();
		while(s!= null) {
			Matcher m = p.matcher(s);
			while(m.find()) {
				System.out.println(m.group());
				count++;	
			}
			s=bf.readLine();
		}
		System.out.println(count);
	}

}
