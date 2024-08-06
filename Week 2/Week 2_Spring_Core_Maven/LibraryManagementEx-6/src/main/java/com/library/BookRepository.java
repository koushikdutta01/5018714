package com.library;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
	private int bookavl;

	public int getBookavl() {
		return bookavl;
	}

	public void setBookavl(int bookavl) {
		this.bookavl = bookavl;
	}

	public BookRepository() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookRepository(int bookavl) {
	    this.bookavl = bookavl;
	}

	
	
	
	

}
