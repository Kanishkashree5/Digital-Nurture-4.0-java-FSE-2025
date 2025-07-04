package com.example.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        GreetingService greetingService = (GreetingService) context.getBean("greetingService");
        greetingService.greet("Kanishkashree");
    }
}
