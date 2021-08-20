package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.PizzaOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PizzaOrderService {
    public List<PizzaOrder> getAll();
    public void newOrder(PizzaOrder pizzaOrder);
}
