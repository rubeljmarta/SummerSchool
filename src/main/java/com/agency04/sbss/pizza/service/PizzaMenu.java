package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Pizza;

import java.util.List;

public interface PizzaMenu {
    public void newMenu(List<Pizza> pizzas, List<String> sizes);
    public List<Pizza> getPizzas();
    public List<String> getSizes();
}
