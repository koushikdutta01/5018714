package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private String bookName;
    private BookRepository bookRepo;

    public BookService(String bookName) {
        this.bookName = bookName;
    }

    public void setBookRepo(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public String toString() {
        return "BookService [bookName=" + bookName + ", bookRepoMessage=" + bookRepo.displayRepository() + "]";
    }
}

