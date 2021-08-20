package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.*;

import java.util.List;

public interface PizzaDeliveryService {
    public List<Delivery> getAll();
    public Delivery createOrUpdateDelivery(Delivery delivery);
    public String orderPizza(Pizza pizza);
}