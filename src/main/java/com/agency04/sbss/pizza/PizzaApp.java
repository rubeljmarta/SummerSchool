package com.agency04.sbss.pizza;

import org.springframework.context.support.ClassPathXmlApplicationContext;

enum Ingredients{
    tomato_Sauce, mozzarella, oregano, garlic, basil, mushrooms, ham, artichokes, olives

}

public class PizzaApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring-context.xml");

        Pizza theMargherita = context.getBean("margherita",Pizza.class);
        Pizza theMarinara = context.getBean("myMarinara",Pizza.class);
        Pizza theQuattroStagioni = context.getBean("myQuattroStagioni",Pizza.class);

        System.out.println("\n");

        //TESTING CONSTRUCTOR INJECTION OR SETTER INJECTION
        PizzaDeliveryService thePizzaDeliveryService = context.getBean("myPizzaDeliveryService", PizzaDeliveryService.class);
        System.out.println("TESTING CONSTRUCTOR INJECTION" + "\n");
        System.out.println(thePizzaDeliveryService.orderPizza(theMargherita));
        System.out.println(thePizzaDeliveryService.orderPizza(theQuattroStagioni));
        System.out.println(thePizzaDeliveryService.orderPizza(theMarinara));
        System.out.println("\n");


        //TESTING LITERAL VALUES OR FROM PROPERTIES FILE
        System.out.println("TESTING LITERAL VALUES OR FROM PROPERTIES FILE" + "\n");
        System.out.println(thePizzaDeliveryService.getAddress());
        System.out.println(thePizzaDeliveryService.getName());
        System.out.println((thePizzaDeliveryService.getPhoneNumber()));
        System.out.println("\n");


        context.close();


    }

}
