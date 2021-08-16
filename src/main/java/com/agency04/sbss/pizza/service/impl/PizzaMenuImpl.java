package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.service.PizzaMenu;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaMenuImpl implements PizzaMenu {
    private List<Pizza> pizzas;
    private List<String> sizes;

    public PizzaMenuImpl(){}


    @Override
    public void newMenu(List<Pizza> pizzas, List<String> sizes) {
        this.pizzas=pizzas;
        this.sizes=sizes;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void setSizes(List<String> sizes) {
        this.sizes = sizes;
    }

    public List<String> getSizes(){
        return sizes;
    }
}