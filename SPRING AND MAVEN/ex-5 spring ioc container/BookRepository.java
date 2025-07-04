package com.example.springapp;

public class BookRepository {
    public void save(String bookTitle) {
        System.out.println("[BookRepository] Book saved: " + bookTitle);
    }
}
