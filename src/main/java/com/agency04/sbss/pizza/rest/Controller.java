package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.model.*;
import com.agency04.sbss.pizza.service.CustomerService;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.*;


@RestController
@RequestMapping("/api")
public class Controller {

    private PizzaMenu thePizzaMenu;

    @Autowired
    private CustomerService theCustomerService;

    @Autowired
    private PizzeriaService pizzeria;

    @Autowired
    private PizzaDeliveryService thePizzaDeliveryService;

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

    @GetMapping("/pizzeria/menu")
    public PizzaMenu getMenu(){

        return thePizzaMenu;
    }

    @GetMapping("/pizzeria")
    public  PizzeriaService getPizzerias(){
        return pizzeria;
    }

    @RequestMapping("/customer/{name}")
    public Customer getCustomer(@PathVariable("name") String name){
        return theCustomerService.getByName(name);
    }

    @RequestMapping("/customer")
    public List<Customer> all_customer(){
        return theCustomerService.getAll();
    }

    @PostMapping("/customer")
    public void addCustomer(@RequestBody Customer customer){
        theCustomerService.addNew(customer);
    }

    @PutMapping("/customer")
    public void update(@RequestBody Customer customer){
        theCustomerService.update(customer);
    }

    @DeleteMapping("/customer/{name}")
    public void deleteCustomer(@PathVariable("name") String name){
        theCustomerService.deleteByName(name);
    }

    @PostMapping("/delivery/order")
    public void addOrder(@RequestBody DeliveryOrderForm delivery){
        thePizzaDeliveryService.addOrder(delivery);
    }

    @GetMapping("/delivery/list")
    public List<DeliveryOrderForm> getDeliveryList(){
        return thePizzaDeliveryService.getOrders();
    }
}