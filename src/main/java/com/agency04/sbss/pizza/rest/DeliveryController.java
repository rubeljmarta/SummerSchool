package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.model.*;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {

    @Autowired
    private PizzaDeliveryService thePizzaDeliveryService;

    @PostMapping("/order")
    public ResponseEntity<Delivery> newDelivery(@RequestBody Delivery delivery){
        Delivery theDelivery = thePizzaDeliveryService.createOrUpdateDelivery(delivery);
        return new ResponseEntity<Delivery>(theDelivery, HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public List<Delivery> orderList(){
        return thePizzaDeliveryService.getAll();
    }

}