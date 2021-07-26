package com.agency04.sbss.pizza;

public class Pizzeria implements PizzeriaService {



    public  Pizzeria(){}
    // define a private field for the dependency


    @Override
    public String getName() {
        return "Melada";
    }

    @Override
    public String getAddress() {
        return "Benka Benkovica";
    }

    @Override
    public String getPhoneNumber() {
        return "0978544545";
    }


    @Override
    public String makePizza(Pizza pizza) {
        return pizza.getName() + "\n Ingredients: " + pizza.getIngredients();
    }
}
