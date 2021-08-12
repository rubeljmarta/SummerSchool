package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.model.*;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/pizzeria")
public class PizzaController {

    private PizzaMenu thePizzaMenu;

    @Autowired
    private PizzeriaService pizzeria;

    @PostConstruct
    public void load(){
        thePizzaMenu =new PizzaMenu();

        ArrayList<String> sizes=new ArrayList<String>();
        sizes.add("Small");
        sizes.add("Medium");
        sizes.add("Jumbo");
        thePizzaMenu.setSizes(sizes);

        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Margherita());
        pizzas.add(new Marinara());
        pizzas.add(new QuattroStagioni());
        thePizzaMenu.setPizzas(pizzas);
    }

    @GetMapping("/menu")
    public PizzaMenu getMenu(){

        return thePizzaMenu;
    }

    @GetMapping("")
    public  PizzeriaService getPizzerias(){
        return pizzeria;
    }
}