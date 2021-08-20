package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.model.*;
import com.agency04.sbss.pizza.service.PizzaMenu;
import com.agency04.sbss.pizza.service.PizzaService;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/pizzeria")
public class PizzaController {

    @Autowired
    private PizzaMenu pizzaMenu;

    @Autowired
    private PizzaService pizzaService;

    @Autowired
    private PizzeriaService pizzeriaService;

    @GetMapping("/pizzas")
    public List<Pizza> pizzas(){

        return pizzaService.getAll();
    }
    @GetMapping("/menu")
    public PizzaMenu pizzaMenu(){
        pizzaMenu.setPizzas(pizzas());
        return pizzaMenu;
    }

    @GetMapping("")
    public  PizzeriaService pizzeria(){
        return pizzeriaService;
    }
}