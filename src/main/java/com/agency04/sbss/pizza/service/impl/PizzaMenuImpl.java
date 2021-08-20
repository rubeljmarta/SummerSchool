package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.model.Size;
import com.agency04.sbss.pizza.service.PizzaMenu;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PizzaMenuImpl implements PizzaMenu {
    private List<Pizza> pizzas;
    private List<Size> sizes;

    public PizzaMenuImpl(){}

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    @Override
    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas=pizzas;
    }

    public List<Size> getSizes(){
        return Arrays.asList(Size.values());
    }
}