package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.model.*;
import com.agency04.sbss.pizza.service.PizzaMenu;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/pizzeria")
public class PizzaController {

    @Autowired
    private PizzaMenu pizzaMenu;

    @Autowired
    private PizzeriaService pizzeria;

    @PostConstruct
    public void load(){

        ArrayList<String> sizes=new ArrayList<String>();
        sizes.add("Small");
        sizes.add("Medium");
        sizes.add("Jumbo");

        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Margherita());
        pizzas.add(new Marinara());
        pizzas.add(new QuattroStagioni());

        pizzaMenu.newMenu(pizzas,sizes);
    }

    @GetMapping("/menu")
    public PizzaMenu pizzaMenu(){

        return pizzaMenu;
    }

    @GetMapping("")
    public  PizzeriaService pizzeria(){
        return pizzeria;
    }
}