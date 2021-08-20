package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Pizza;

import java.util.List;

public interface PizzaService {
    public List<Pizza> getAll();
    public void newPizza(Pizza pizza);
}
