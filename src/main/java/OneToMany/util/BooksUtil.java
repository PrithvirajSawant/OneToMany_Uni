package OneToMany.util;

import java.util.Scanner;

import OneToMany.entities.Books;

public class BooksUtil {
//	public static Scanner sc = new Scanner(System.in);
//	public static Books getBooks()
//	{
//		System.out.println("Enter the Book details");
//		return new Books(sc.next(), sc.nextLong());
//	}
	public static Books getBooks(String name, long uid) {
		return new Books(name, uid);

	}

}
