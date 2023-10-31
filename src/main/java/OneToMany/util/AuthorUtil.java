package OneToMany.util;

import java.util.Scanner;

import OneToMany.entities.Author;

public class AuthorUtil {

//	public static Scanner sc = new Scanner(System.in);
//	public static Author getAuthor() {
//		System.out.println("Enter the Author Details");
//		return new Author(sc.next(), sc.nextInt(), sc.next());
//	}

	public static Author getAuthor(String name, int age, String loc) {
		return new Author(name, age, loc);

	}
}
