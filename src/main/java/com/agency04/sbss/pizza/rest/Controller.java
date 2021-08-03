package com.agency04.sbss.pizza.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/Pizzeria")
    public String Home(){
        return "<b>Pizzeria</b><br><br>Hi, which pizza do you want? Margherita, Marinara or Quattro Stagioni?";
    }
}