package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.Repository.DeliveryRepository;
import com.agency04.sbss.pizza.model.*;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Optional;

@Service("pizzaDelivery")
public class PizzaDelivery implements PizzaDeliveryService {

    private Pizza pizza;

    @Autowired
    private DeliveryRepository deliveryRepository;

    @Autowired
    private PizzeriaService pizzeriaService;

    public PizzaDelivery(){}


    @Override
    public List<Delivery> getAll() {
        return deliveryRepository.findAll();
    }

    @Override
    public Delivery createOrUpdateDelivery(Delivery delivery) {
        Optional<Delivery> result =
                deliveryRepository.findById(delivery.getId());
        Delivery theDelivery = null;
        if(result.isPresent()){
            theDelivery = result.get();
            theDelivery.setCustomer(delivery.getCustomer());
            theDelivery.setSubmissionDate(delivery.getSubmissionDate());
            return deliveryRepository.save(theDelivery);
        }
        else{
            return deliveryRepository.save(delivery);
        }
    }

    @Override
    public String orderPizza(Pizza thePizza) {

        String s = "Delivering pizza: " + pizzeriaService.makePizza(pizza) +
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