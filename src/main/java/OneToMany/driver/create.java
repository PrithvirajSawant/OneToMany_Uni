package OneToMany.driver;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import OneToMany.entities.Author;
import OneToMany.entities.Books;
import OneToMany.util.AuthorUtil;
import OneToMany.util.BooksUtil;



public class create {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Books books = BooksUtil.getBooks("HarryPotter",900);
		Author author = AuthorUtil.getAuthor("John Doe", 35, "New York");
//		author = AuthorUtil.getAuthor("John Do", 35, "New York");
//		author.setBooks((List<Books>) books);
		// Create a list of authors associated with the books
		List<Author> authorBooks = new ArrayList<>();
		authorBooks.add(author);

		// Set the list of authors in the book entity
		books.setAuthor(authorBooks);
		
		em.persist(books);
		em.persist(author);
		
		et.commit();
	}
	
	
}
