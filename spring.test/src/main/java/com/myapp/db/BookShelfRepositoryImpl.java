package com.myapp.db;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookShelfRepositoryImpl implements BookShelfRepositoryInterface {

	JdbcTemplate jdbcTemplate;

	public BookShelfRepositoryImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void saveBook(Book book) {
		jdbcTemplate.update(BookQueryConstants.INSERT, book.getBookId(), book.getBookName(), book.getBookVersion(),
				book.getBookAuthor());
		System.out.println("Book Saved into Bookshelf with bookID  : " + book.getBookId());
	}

	public void updateBook(Book book) {
		jdbcTemplate.update(BookQueryConstants.UPDATE, book.getBookId(), book.getBookName(), book.getBookVersion(),
				book.getBookAuthor(),book.getBookId());
		System.out.println("Book Updated into Bookshelf with bookID  : " + book.getBookId());
	}

	public void deleteBook(Book book) {
		jdbcTemplate.update(BookQueryConstants.DELETE, book.getBookId());
		System.out.println("Book Deleted with ID "+book.getBookId());
	}

	public Book getBookById(String id) {
		return jdbcTemplate.queryForObject(BookQueryConstants.GETBYID, new Object[] { id }, new BookShelfMapper());
	}

	public List<Book> getAllBook() {
		return jdbcTemplate.query(BookQueryConstants.GETALL, new BookShelfMapper());
	}

}
