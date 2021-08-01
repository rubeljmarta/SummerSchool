package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Pizzeria implements PizzeriaService {


    @Value("${name}")
    private String name;

    @Value("${address}")
    private String address;

    @Value("${phoneNumber}")
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

    @PostConstruct
    public void postConstructor(){
        this.name="Gusti";
        this.address="Vukovarska ulica";
        this.phoneNumber="0955414125";
        System.out.println("PostConstructor message: Order from new pizzeria " + this.name);
    }

    @PreDestroy
    public void postDestroy(){
        System.out.println("PreDestroy message: Successful order!");
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
        return pizza.getName() + "\n Ingredients: " + pizza.getIngredients();
    }
}
