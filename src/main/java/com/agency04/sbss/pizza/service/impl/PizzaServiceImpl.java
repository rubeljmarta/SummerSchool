package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.Repository.PizzaRepository;
import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Override
    public List<Pizza> getAll() {
        return pizzaRepository.findAll();
    }

    @Override
    public void newPizza(Pizza pizza) {
        pizzaRepository.save(pizza);
    }
}