package com.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private String bookname;
    private String author;
    private BookRepository books;

    @Autowired
    public BookService(String author) {
        this.author = author;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    @Autowired
    public void setBooks(BookRepository books) {
        this.books = books;
    }

    public void printS() {
        System.out.println(this.bookname + " where bookname came from BookService and "
                + "books availability is " + this.books.getBookavl() + " came From BookRepository, Who's "
                + "Author is " + this.author);
    }
}
