package com.example.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookService");

        System.out.println("📚 Welcome to the Library Management System 📚");
        bookService.addBook("Clean Code by Robert C. Martin");
    }
}

