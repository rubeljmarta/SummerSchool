package com.agency04.sbss.pizza;

public class Marinara implements Pizza {

    public  Marinara(){}


    @Override
    public String getName() {
        return "Marinara";
    }

    @Override
    public String getIngredients() {
        return Ingredients.tomato_Sauce + ", " + Ingredients.garlic + ", " + Ingredients.basil;
    }


}
