package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter for Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {
        System.out.println("[BookService] Processing book entry: \"" + bookName + "\"");
        bookRepository.save(bookName);
        System.out.println("[BookService] Book added successfully.");
    }
}
