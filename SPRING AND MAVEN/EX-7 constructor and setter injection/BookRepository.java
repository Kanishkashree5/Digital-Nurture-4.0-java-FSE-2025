package com.example.springapp;

public class BookRepository {
    public void save(String bookName) {
        System.out.println("[BookRepository] Book saved to the database: \"" + bookName + "\"");
    }
}
