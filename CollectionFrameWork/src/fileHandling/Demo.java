package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\shrab\\OneDrive\\Documents\\Html-css-course\\Documents\\Desktop\\CJD-M18\\java.txt");
	//	System.out.println(f.mkdir()); //Create NewFolder
		System.out.println(f.createNewFile());
		//System.out.println(f.canExecute());
//		System.out.println(f.canRead());
//		System.out.println(f.getAbsolutePath());
		
		File f2 = new File("C:\\Users\\shrab\\OneDrive\\Documents\\Html-css-course\\Documents\\Desktop\\CJD-M18\\javadev.txt");
		System.out.println(f.renameTo(f2));
		System.out.println(f2.delete());

	}

}
