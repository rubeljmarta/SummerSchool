package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.model.*;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {

    @Autowired
    private PizzaDeliveryService thePizzaDeliveryService;

    @PostMapping("/order")
    public void newOrder(@RequestBody DeliveryOrderForm delivery){
        thePizzaDeliveryService.newOrder(delivery);
    }

    @GetMapping("/list")
    public List<DeliveryOrderForm> orderList(){
        return thePizzaDeliveryService.orderList();
    }
}