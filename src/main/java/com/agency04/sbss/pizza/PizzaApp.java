package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.service.Pizza;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class PizzaApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring-context.xml");

        Pizza theMargherita = context.getBean("margherita",Pizza.class);
        Pizza theMarinara = context.getBean("marinara",Pizza.class);
        Pizza theQuattroStagioni = context.getBean("quattroStagioni",Pizza.class);

        System.out.println("\n");

        PizzaDeliveryService thePizzaDeliveryService = context.getBean("pizzaDelivery", PizzaDeliveryService.class);
        System.out.println(thePizzaDeliveryService.orderPizza(theMargherita));
        System.out.println(thePizzaDeliveryService.orderPizza(theQuattroStagioni));
        System.out.println(thePizzaDeliveryService.orderPizza(theMarinara));

        System.out.println("\n");



        context.close();


    }

}
