package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter method for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayService() {
        System.out.println("BookService is working.");
        if (bookRepository != null) {
            System.out.println("BookRepository is injected.");
            bookRepository.displayRepository();
        } else {
            System.out.println("BookRepository is not initialized.");
        }
    }
}
