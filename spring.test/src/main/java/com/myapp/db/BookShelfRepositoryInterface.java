package com.myapp.db;

import java.util.List;

public interface BookShelfRepositoryInterface {
	public void saveBook(Book book);

	public void updateBook(Book book);

	public void deleteBook(Book book);

	public Book getBookById(String id);

	public List<Book> getAllBook();

}
