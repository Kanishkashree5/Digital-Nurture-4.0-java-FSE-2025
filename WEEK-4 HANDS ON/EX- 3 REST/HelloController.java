package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    public String sayHello() {
        LOGGER.info("START sayHello()");
        String message = "Hello World!!";
        LOGGER.info("END sayHello()");
        return message;
    }
}

