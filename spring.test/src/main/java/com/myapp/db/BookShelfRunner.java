package com.myapp.db;

import java.util.List;
import java.util.UUID;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookShelfRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BookShelfConfig.class);
		BookShelfRepositoryImpl bookShelfRepositoryImpl = context.getBean(BookShelfRepositoryImpl.class);

		UUID uuid = UUID.randomUUID();
		Book book = new Book();
		book.setBookId(uuid.toString());
		book.setBookName("HTML Basic");
		book.setBookVersion(1);
		book.setBookAuthor("P. S. Shastri");

		//bookShelfRepositoryImpl.saveBook(book);

		System.out.println("*******************");

		
		List<Book> bookList = bookShelfRepositoryImpl.getAllBook();
		for (Book bookx : bookList) {
			System.out.println(bookx);
		}
		
		
		System.out.println("*******************");
		
		/*
		Book book = bookShelfRepositoryImpl.getBookById("1");
		System.out.println(book);
		*/
		
		System.out.println("*******************");
		
		/*
		Book book2 = new Book();
		book2.setBookId("6ea9a6f7-f3a7-45b9-9e28-f2bcc7bbb4d3");
		book2.setBookName("Java");
		book2.setBookVersion(1);
		book2.setBookAuthor("T.N Naidu");
		bookShelfRepositoryImpl.updateBook(book2);
		*/
		
		/*
		Book book3 = new Book();
		book3.setBookId("920515e2-efc5-40b2-8187-40065a359473");
		book3.setBookName("Java");
		book3.setBookVersion(1);
		book3.setBookAuthor("T.N Naidu");
		bookShelfRepositoryImpl.deleteBook(book3);
		*/
	}

}
