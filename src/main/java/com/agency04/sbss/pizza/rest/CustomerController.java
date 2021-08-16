package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.model.*;
import com.agency04.sbss.pizza.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService theCustomerService;

    @PostConstruct
    public void load(){
        theCustomerService.newCustomer(new Customer("Marta", "Benka Benkovica 1H","0977852258"));
        theCustomerService.newCustomer(new Customer("Marko", "Put Nina 115B","0998541487"));
        theCustomerService.newCustomer(new Customer("Josipa", "Ante starcevica 32","0985545696"));
    }

    @GetMapping("/{name}")
    public Customer customerByName(@PathVariable("name") String name){
        return theCustomerService.customerByName(name);
    }

    @GetMapping("")
    public List<Customer> allCustomers(){
        return theCustomerService.allCustomers();
    }

    @PostMapping("")
    public void newCustomer(@RequestBody Customer customer){
        theCustomerService.newCustomer(customer);
    }

    @PutMapping("")
    public void updateCustomer(@RequestBody Customer customer){
        theCustomerService.updateCustomer(customer);
    }

    @DeleteMapping("/{name}")
    public void deleteCustomerByName(@PathVariable("name") String name){
        theCustomerService.deleteCustomerByName(name);
    }
}