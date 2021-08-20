package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Customer;

import java.util.List;

public interface CustomerService {
    public Customer customerByName(String name);
    public List<Customer> allCustomers();
    public Customer createOrUpdateCustomer(Customer customer);
    public void deleteCustomerByName(String name);
}
