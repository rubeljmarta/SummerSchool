package com.agency04.sbss.pizza.model;

import java.util.List;

public class PizzaMenu {
    private List<Pizza> pizzas;
    private List<String> sizes;

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