package com.agency04.sbss.pizza.model;

import com.agency04.sbss.pizza.service.Pizza;
import org.springframework.stereotype.Component;

@Component
public class Margherita implements Pizza {


    @Override
    public String getName() {
        return "Margherita";
    }

    @Override
    public String getIngredients() {

        return Ingredients.tomato_Sauce + ", " + Ingredients.mozzarella + ", " + Ingredients.oregano;
    }


}

