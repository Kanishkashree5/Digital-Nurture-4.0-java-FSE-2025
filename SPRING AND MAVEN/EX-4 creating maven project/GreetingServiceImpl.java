package com.example.springapp;

public class GreetingServiceImpl implements GreetingService {
    public void greet(String name) {
        System.out.println("Hello, " + name + "! Welcome to Spring.");
    }
}

