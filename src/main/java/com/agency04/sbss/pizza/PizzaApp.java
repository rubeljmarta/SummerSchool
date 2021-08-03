package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.model.Margherita;
import com.agency04.sbss.pizza.model.Marinara;
import com.agency04.sbss.pizza.model.QuattroStagioni;
import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.rest.Controller;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PizzaApp {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(PizzaApp.class);

        PizzaDeliveryService thePizzaDeliveryService = context.getBean("pizzaDelivery", PizzaDeliveryService.class);

        Pizza theMargherita = new Margherita();
        System.out.println(thePizzaDeliveryService.orderPizza(theMargherita));

        //context.close();
    }
}