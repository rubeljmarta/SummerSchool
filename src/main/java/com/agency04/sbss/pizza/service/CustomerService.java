package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Customer;

import java.util.List;

public interface CustomerService {
    public Customer getByName(String name);
    public List<Customer> getAll();
    public void addNew(Customer customer);
    public void update(Customer customer);
    public void deleteByName(String name);
}
