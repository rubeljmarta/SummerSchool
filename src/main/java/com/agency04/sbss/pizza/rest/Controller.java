package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.model.Margherita;
import com.agency04.sbss.pizza.model.Marinara;
import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.model.QuattroStagioni;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @Autowired
    private PizzaDeliveryService thepizzaDeliveryService;

    Pizza theMargherita = new Margherita();
    Pizza theMarinara = new Marinara();
    Pizza theQuattroStagioni = new QuattroStagioni();

    @GetMapping("/")
    public String Home(){
        return "<b>Pizza Delivery</b><br><br>" +
                "Order Margherita - click: <a href='/margherita'>here</a> <br>" +
                "Order Marinara - click <a href='/marinara'>here</a> <br>" +
                "Order Quattrostagione - click: <a href='/quattrostagione'>here</a> <br>";
    }

    @GetMapping("/margherita")
    public String Margherita(){
        return  "<b>Pizza Delivery</b><br><br>" + thepizzaDeliveryService.orderPizza(theMargherita) + "<br><br><a href='/'>Home</a>";
    }

    @GetMapping("/marinara")
    public String Marinara(){
        return  "<b>Pizza Delivery</b><br><br>" + thepizzaDeliveryService.orderPizza(theMarinara) + "<br><br><a href='/'>Home</a>";
    }

    @GetMapping("/quattrostagione")
    public String Quattrostagione(){
        return  "<b>Pizza Delivery</b><br><br>" + thepizzaDeliveryService.orderPizza(theQuattroStagioni) + "<br><br><a href='/'>Home</a>";
    }
}