package com.myapp.db;

import org.springframework.stereotype.Component;

@Component
public class Book {
	String bookId;
	String bookName;
	int bookVersion;
	String bookAuthor;

	public Book() {
	
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookVersion() {
		return bookVersion;
	}

	public void setBookVersion(int bookVersion) {
		this.bookVersion = bookVersion;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookVersion=" + bookVersion + ", bookAuthor="
				+ bookAuthor + "]";
	}



	
	
}
