package com.agency04.sbss.pizza;

import org.springframework.context.support.ClassPathXmlApplicationContext;

enum Ingredients{
    tomato_Sauce, mozzarella, oregano, garlic, basil, mushrooms, ham, artichokes, olives

}

public class PizzaApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring-context.xml");

        Pizza theMargherita = context.getBean("myMargherita",Pizza.class);
        Pizza theMarinara = context.getBean("myMarinara",Pizza.class);
        Pizza theQuattroStagioni = context.getBean("myQuattroStagioni",Pizza.class);

        System.out.println("\n");

        //TESTING CONSTRUCTOR INJECTION
        PizzaDeliveryService thePizzaDeliveryService = context.getBean("myPizzaDeliveryService", PizzaDeliveryService.class);
        System.out.println("TESTING CONSTRUCTOR INJECTION" + "\n");
        System.out.println(thePizzaDeliveryService.orderPizza(theMargherita));
        System.out.println(thePizzaDeliveryService.orderPizza(theQuattroStagioni));
        System.out.println(thePizzaDeliveryService.orderPizza(theMarinara));
        System.out.println("\n");


        //TESTING SETTER INJECTION
        SecondPizzaDeliveryService theSecondPizzaDeliveryService = context.getBean("mySecondPizzaDeliveryService", SecondPizzaDeliveryService.class);
        System.out.println("TESTING SETTER INJECTION" + "\n");
        System.out.println(theSecondPizzaDeliveryService.orderPizza(theMargherita));
        System.out.println(theSecondPizzaDeliveryService.orderPizza(theQuattroStagioni));
        System.out.println(theSecondPizzaDeliveryService.orderPizza(theMarinara));
        System.out.println("\n");


        //TESTING LITERAL VALUES
        System.out.println("TESTING LITERAL VALUES" + "\n");
        System.out.println(thePizzaDeliveryService.getAddress());
        System.out.println(thePizzaDeliveryService.getName());
        System.out.println((thePizzaDeliveryService.getPhoneNumber()));
        System.out.println("\n");


        System.out.println("TESTING VALUES FROM PROPERTIES FILE" + "\n");
        System.out.println(theSecondPizzaDeliveryService.getAddress());
        System.out.println(theSecondPizzaDeliveryService.getName());
        System.out.println((theSecondPizzaDeliveryService.getPhoneNumber()));
        System.out.println("\n");



        context.close();


    }

}
