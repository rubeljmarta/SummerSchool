package com.agency04.sbss.pizza.service.service.impl;


import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaDelivery implements PizzaDeliveryService {

    @Autowired
    @Qualifier("pizzeria")
    private PizzeriaService pizzeriaService;

/*    //Constructor injection
    @Autowired
    public PizzaDelivery(@Qualifier("pizzeria")PizzeriaService thePizzeriaService){
        pizzeriaService=thePizzeriaService;
    }

    //Setter injection
    @Autowired
    @Qualifier("pizzeriaSpeedy")
    public void setPizzeriaService(PizzeriaService pizzeriaService) {
        this.pizzeriaService = pizzeriaService;
    }*/

    @Override
    public String orderPizza(Pizza thePizza) {

        String s = "Delivering pizza: " + pizzeriaService.makePizza(thePizza) +
                "\n Address: " + pizzeriaService.getAddress() +
                "\n Name: " + pizzeriaService.getName() +
                "\n Phone Number: " + pizzeriaService.getPhoneNumber() + "\n";
        return s;
    }
}
