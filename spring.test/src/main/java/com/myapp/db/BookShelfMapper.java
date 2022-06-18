package com.myapp.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BookShelfMapper implements RowMapper<Book> {

	public Book mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		
		Book book=new Book();
			book.setBookId(resultSet.getString("book_id"));
			book.setBookName(resultSet.getString("book_name"));
			book.setBookVersion(resultSet.getInt("book_version"));
			book.setBookAuthor(resultSet.getString("book_author_name"));
		return book;
	}

}
