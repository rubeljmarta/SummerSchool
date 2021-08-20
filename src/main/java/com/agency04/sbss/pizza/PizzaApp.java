package com.agency04.sbss.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PizzaApp  {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(PizzaApp.class);

    }
}