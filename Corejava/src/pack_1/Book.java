package pack_1;
import java.util.Scanner;

public class Book{ 
	String name ;
	String author;
	double price;
	
	public Book(String name,String author,double price){
		this.name = name;
		this.author=author;
		this.price=price;
	}

public void display() {
	System.out.println(name+ " " + author+ " " + price);
}
public static Book createBook() {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Book Name");
	String name = s.nextLine();
	String author = s.nextLine();
	double price = s.nextDouble();
	return new Book(name,author,price);
}
}