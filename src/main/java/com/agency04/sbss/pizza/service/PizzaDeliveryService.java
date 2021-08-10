package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.model.DeliveryOrderForm;

import java.util.List;

public interface PizzaDeliveryService {
    public String orderPizza(Pizza thePizza);
    public void addOrder(DeliveryOrderForm theDeliveryOrderForm);
    public List<DeliveryOrderForm> getOrders();
}