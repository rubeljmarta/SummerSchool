package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.model.*;
import com.agency04.sbss.pizza.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService theCustomerService;

    @GetMapping("/{name}")
    public Customer customerByName(@PathVariable("name") String name){
        return theCustomerService.customerByName(name);
    }

    @GetMapping("")
    public List<Customer> allCustomers(){
        return theCustomerService.allCustomers();
    }

    @PostMapping("")
    public ResponseEntity<Customer> newCustomer(@RequestBody Customer customer){
        Customer theCustomer = theCustomerService.createOrUpdateCustomer(customer);
        return new ResponseEntity<Customer>(theCustomer, HttpStatus.CREATED);
    }

    @PutMapping("")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
        Customer theCustomer = theCustomerService.createOrUpdateCustomer(customer);
        return new ResponseEntity<Customer>(theCustomer, HttpStatus.CREATED);
    }

    @DeleteMapping("/{name}")
    public void deleteCustomerByName(@PathVariable("name") String name){
        theCustomerService.deleteCustomerByName(name);
    }
}