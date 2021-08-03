package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service("pizzaDelivery")
public class PizzaDelivery implements PizzaDeliveryService {

    @Autowired
    private PizzeriaService pizzeriaService;

/*    //Constructor injection
    //@Autowired
    public PizzaDelivery(PizzeriaService thePizzeriaService){
        pizzeriaService=thePizzeriaService;
    }*/
/*
    //Setter injection
    @Autowired
    @Qualifier("pizzeriaSpeedy")
    public void setPizzeriaService(PizzeriaService pizzeriaService) {
        this.pizzeriaService = pizzeriaService;
    }*/

    @Override
    public String orderPizza(Pizza thePizza) {

        String s = "Delivering pizza: " + pizzeriaService.makePizza(thePizza) +
                "\n Address: " + pizzeriaService.getAddress() +
                "\n Name: " + pizzeriaService.getName() +
                "\n Phone Number: " + pizzeriaService.getPhoneNumber() + "\n";
        return s;
    }

    @PostConstruct
    public void Start(){
        System.out.println("Order from pizzeria: " + pizzeriaService.getName());
    }

    @PreDestroy
    public void Stop(){
        System.out.println("Closed pizzeria: " + pizzeriaService.getName());
    }
}