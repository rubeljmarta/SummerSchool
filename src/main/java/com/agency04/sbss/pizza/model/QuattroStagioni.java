package com.agency04.sbss.pizza.model;

public class QuattroStagioni implements Pizza {

    @Override
    public String getName() {
        return "Quattro Stagioni";
    }

    @Override
    public String getIngredients() {
        return Ingredients.tomato_Sauce + ", " + Ingredients.mozzarella + ", " + Ingredients.mushrooms +
                ", " + Ingredients.ham + ", " + Ingredients.artichokes + ", " + Ingredients.olives + ", " +
                Ingredients.oregano;
    }
}
