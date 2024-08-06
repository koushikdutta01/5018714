package com.library.service;

public class Services {
    public void addBook(String title, String author) {
        System.out.println("Saving book: " + title + " by " + author);
    }

    public void findBook(String title) {
        System.out.println("Finding book: " + title);
    }
}
