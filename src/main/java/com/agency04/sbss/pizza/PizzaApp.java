package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.model.Margherita;
import com.agency04.sbss.pizza.model.Marinara;
import com.agency04.sbss.pizza.model.QuattroStagioni;
import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring-context.xml");
        PizzaDeliveryService thePizzaDeliveryService = context.getBean("pizzaDelivery", PizzaDeliveryService.class);

        Pizza theMargherita = new Margherita();
        System.out.println(thePizzaDeliveryService.orderPizza(theMargherita));

        Pizza theMarinara = new Marinara();
        System.out.println(thePizzaDeliveryService.orderPizza(theMarinara));

        Pizza theQuattroStagioni = new QuattroStagioni();
        System.out.println(thePizzaDeliveryService.orderPizza(theQuattroStagioni));

        context.close();
    }
}