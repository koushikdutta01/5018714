package com.library;

public class BookService {
    private String bookname;
    private BookRepository books;

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setBooks(BookRepository books) {
        this.books = books;
    }

    public void printS() {
        System.out.println(this.bookname + " where bookname came from BookService and "
                + "books availability is " + this.books.getBookavl()  + " came From BookRepository");
    }
}
