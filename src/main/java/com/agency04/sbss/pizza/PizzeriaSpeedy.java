package com.agency04.sbss.pizza;

public class PizzeriaSpeedy implements PizzeriaService{

    private Pizza pizza;

    public PizzeriaSpeedy(){
    }





    @Override
    public String getName() {
        return "Pizzeria Speedy";
    }

    @Override
    public String getAddress() {
        return "Put Nina";
    }

    @Override
    public String getPhoneNumber() {
        return "0988521200";
    }

    @Override
    public String makePizza(Pizza pizza) {
        return pizza.getName() + "\n Ingredients: " + pizza.getIngredients();

    }

}
