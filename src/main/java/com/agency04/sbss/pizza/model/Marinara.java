package com.agency04.sbss.pizza.model;


import com.agency04.sbss.pizza.service.Pizza;
import org.springframework.stereotype.Component;

@Component
public class Marinara implements Pizza {



    @Override
    public String getName() {
        return "Marinara";
    }

    @Override
    public String getIngredients() {
        return Ingredients.tomato_Sauce + ", " + Ingredients.garlic + ", " + Ingredients.basil;
    }


}
