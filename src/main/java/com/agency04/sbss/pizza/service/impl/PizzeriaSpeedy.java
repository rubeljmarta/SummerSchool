package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PizzeriaSpeedy implements PizzeriaService {

    @Value("Mrak")
    private String name;

    @Value("Ante Stacevica")
    private String address;

    @Value("0915263200")
    private String phoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String makePizza(Pizza pizza) {
        return pizza.getName() + "<br> Ingredients: " + pizza.getIngredients();
    }
}