package com.agency04.sbss.pizza.model;

public enum Ingredients{
    tomato_Sauce("tomato_Sauce"),
    mozzarella("mozzarella"),
    oregano("oregano"),
    garlic("garlic"),
    basil("basil"),
    mushrooms("mushrooms"),
    ham("ham"),
    artichokes("artichokes"),
    olives("olives");
    private String ingredient;

    public String getValue() {
        return ingredient;
    }

    Ingredients(String ingredient){
        this.ingredient=ingredient;
    }
}
