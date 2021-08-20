package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.Repository.CustomerRepository;
import com.agency04.sbss.pizza.exception.CustomerNotFoundException;
import com.agency04.sbss.pizza.model.Customer;
import com.agency04.sbss.pizza.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(){}

    @Override
    public Customer customerByName(String name) {
        Optional<Customer> result = customerRepository.findByUsername(name);
        Customer theCustomer = null;
        if(result.isPresent()){
            theCustomer = result.get();
            return theCustomer;
        }
        else{
            throw new CustomerNotFoundException();
        }
    }

    @Override
    public List<Customer> allCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer createOrUpdateCustomer(Customer customer) {
        Optional<Customer> result =
                customerRepository.findByUsername(customer.getUsername());
        Customer theCustomer = null;
        if(result.isPresent()){
            theCustomer = result.get();
            theCustomer.setCustomerDetails(customer.getCustomerDetails());
            return customerRepository.save(theCustomer);
        }
        else{
            return customerRepository.save(customer);
        }
    }

    @Override
    public void deleteCustomerByName(String name) {
        Customer customer = customerByName(name);
        customerRepository.delete(customer);
    }
}