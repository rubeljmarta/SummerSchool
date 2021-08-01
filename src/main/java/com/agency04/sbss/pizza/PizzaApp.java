package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.model.Margherita;
import com.agency04.sbss.pizza.model.Marinara;
import com.agency04.sbss.pizza.model.QuattroStagioni;
import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {

        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring-context.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PizzaConfig.class);
        PizzaDeliveryService thePizzaDeliveryService = context.getBean("pizzaDelivery", PizzaDeliveryService.class);

        PizzaDeliveryService theSecondPizzaDeliveryService = context.getBean("pizzaDelivery", PizzaDeliveryService.class);

        Pizza theMargherita = new Margherita();
        System.out.println(thePizzaDeliveryService.orderPizza(theMargherita));

        Pizza theMarinara = new Marinara();
        System.out.println(thePizzaDeliveryService.orderPizza(theMarinara));

        Pizza theQuattroStagioni = new QuattroStagioni();
        System.out.println(thePizzaDeliveryService.orderPizza(theQuattroStagioni));

        boolean result = (thePizzaDeliveryService == theSecondPizzaDeliveryService);
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for thePizzaDeliveryService" + thePizzaDeliveryService);
        System.out.println("\nMemory location for theSecondPizzaDeliveryService" + theSecondPizzaDeliveryService);

        context.close();
    }
}