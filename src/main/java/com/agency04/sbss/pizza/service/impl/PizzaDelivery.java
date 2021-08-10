package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.exception.PizzaNotFoundException;
import com.agency04.sbss.pizza.model.*;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("pizzaDelivery")
public class PizzaDelivery implements PizzaDeliveryService {

    @Autowired
    private PizzeriaService pizzeriaService;

    List<DeliveryOrderForm> orderList = new ArrayList<>(Arrays.asList()){};

    public PizzaDelivery(){}

    @Override
    public String orderPizza(Pizza thePizza) {

        String s = "Delivering pizza: " + pizzeriaService.makePizza(thePizza) +
                "<br> Address: " + pizzeriaService.getAddress() +
                "<br> Name: " + pizzeriaService.getName() +
                "<br> Phone Number: " + pizzeriaService.getPhoneNumber() + "<br>";
        return s;
    }

    @Override
    public void addOrder(DeliveryOrderForm theDeliveryOrderForm) {
        orderList.add(theDeliveryOrderForm);
    }

    @Override
    public List<DeliveryOrderForm> getOrders() {
        return orderList;
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