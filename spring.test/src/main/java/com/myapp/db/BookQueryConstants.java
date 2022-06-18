package com.myapp.db;

public final class BookQueryConstants {

	static final String INSERT = "insert into bookshelf(book_id, book_name, book_version, book_author_name) values(?,?,?,?)";
	static final String UPDATE = "update bookshelf set book_id = ?, book_name = ?, book_version  = ? , book_author_name=? where book_id = ?";
	static final String DELETE = "delete from bookshelf where book_id = ?";
	static final String GETALL = "select * from bookshelf";
	static final String GETBYID = "select * from bookshelf where book_id = ?";
}
