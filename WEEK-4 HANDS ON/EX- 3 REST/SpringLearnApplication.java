package com.cognizant.springlearn;

import com.cognizant.springlearn.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringLearnApplication.class, args);

        // Call the HelloController method directly and print to console
        HelloController helloController = context.getBean(HelloController.class);
        String message = helloController.sayHello();
        System.out.println("Output from Controller: " + message);
    }
}

