package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.exception.CustomerNotFoundException;
import com.agency04.sbss.pizza.model.Customer;
import com.agency04.sbss.pizza.service.CustomerService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    public List<Customer> customers = new ArrayList<>(Arrays.asList(
            new Customer("Marta", "Benka Benkovica 1H","0977852258"),
            new Customer("Marko", "Put Nina 115B","0998541487"),
            new Customer("Josipa", "Ante starcevica 32","0985545696")
    ));

    @Override
    public Customer getByName(String name) {
        for(Customer customer : customers){
            if(customer.getName().equals(name)){
                return customer;
            }
        }
        throw  new CustomerNotFoundException();
    }

    @Override
    public List<Customer> getAll() {
        return customers;
    }

    @Override
    public void addNew(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void update(Customer customer) {
        Customer helper = getByName(customer.getName());
        int index = customers.indexOf(helper);
        if(index > -1){
            customers.set(index,customer);
            return;
        }
        else {
            throw new CustomerNotFoundException();
        }
    }

    @Override
    public void deleteByName(String name) {
        for(Customer customer: customers) {
            if(customer.getName().equals(name)){
                customers.remove(customer);
                return;
            }
        }
        throw new CustomerNotFoundException();
    }
}