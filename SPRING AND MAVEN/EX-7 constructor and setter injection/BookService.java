package com.example.springapp;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        System.out.println("Constructor injection used.");
        this.bookRepository = bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Setter injection used.");
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {
        System.out.println("[BookService] Processing book entry: \"" + bookName + "\"");
        bookRepository.save(bookName);
    }
}

