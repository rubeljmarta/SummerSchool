package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.model.*;
import com.agency04.sbss.pizza.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService theCustomerService;

    @GetMapping("/{name}")
    public Customer getCustomer(@PathVariable("name") String name){
        return theCustomerService.getByName(name);
    }

    @GetMapping("")
    public List<Customer> all_customer(){
        return theCustomerService.getAll();
    }

    @PostMapping("")
    public void addCustomer(@RequestBody Customer customer){
        theCustomerService.addNew(customer);
    }

    @PutMapping("")
    public void update(@RequestBody Customer customer){
        theCustomerService.update(customer);
    }

    @DeleteMapping("/{name}")
    public void deleteCustomer(@PathVariable("name") String name){
        theCustomerService.deleteByName(name);
    }
}