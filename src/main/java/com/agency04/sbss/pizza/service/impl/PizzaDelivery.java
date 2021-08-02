package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
@Service
//@Scope("prototype")
public class PizzaDelivery implements PizzaDeliveryService {

    //@Autowired
    //@Qualifier("pizzeria")
    private PizzeriaService pizzeriaService;

    //Constructor injection
    //@Autowired
    public PizzaDelivery(PizzeriaService thePizzeriaService){
        pizzeriaService=thePizzeriaService;
    }
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
                "<br> Address: " + pizzeriaService.getAddress() +
                "<br> Name: " + pizzeriaService.getName() +
                "<br> Phone Number: " + pizzeriaService.getPhoneNumber() + "<br>";
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
