package com.example.springapp;

public class BookService {
    private BookRepository bookRepository;

    // Setter for DI
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookTitle) {
        System.out.println("[BookService] Processing book: " + bookTitle);
        bookRepository.save(bookTitle);
    }
}
