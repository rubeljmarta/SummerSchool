package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.Repository.PizzaOrderRepository;
import com.agency04.sbss.pizza.model.PizzaOrder;
import com.agency04.sbss.pizza.service.PizzaOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaOrderServiceImpl implements PizzaOrderService {

    @Autowired
    public PizzaOrderRepository pizzaOrderRepository;

    @Override
    public List<PizzaOrder> getAll() {
        return pizzaOrderRepository.findAll();
    }

    @Override
    public void newOrder(PizzaOrder pizzaOrder) {
        pizzaOrderRepository.save(pizzaOrder);
    }
}
