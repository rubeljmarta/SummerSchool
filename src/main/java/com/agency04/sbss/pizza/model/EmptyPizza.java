package com.agency04.sbss.pizza.model;

public class EmptyPizza implements Pizza{
    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getIngredients() {
        return null;
    }
}
