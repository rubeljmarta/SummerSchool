package com.agency04.sbss.pizza.model;

public class Margherita implements Pizza {

    public Margherita(){}

    @Override
    public String getName() {
        return "Margherita";
    }

    @Override
    public String getIngredients() {

        return Ingredients.tomato_Sauce + ", " + Ingredients.mozzarella + ", " + Ingredients.oregano;
    }
}