package com.agency04.sbss.pizza.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="customerDetails_id")
    private CustomerDetails customerDetails;

    @JsonIgnore
    @OneToMany(mappedBy="customer",cascade=CascadeType.ALL)
    private List<Delivery> delivery = new ArrayList<Delivery>();

    public Customer(){};

    public Customer(String username, CustomerDetails customerDetails) {
        this.username = username;
        this.customerDetails = customerDetails;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    public List<Delivery> getDelivery() {
        return delivery;
    }

    public void setDelivery(List<Delivery> delivery) {
        this.delivery = delivery;
    }

    public void addDelivery(Delivery delivery){
        this.delivery.add(delivery);
        delivery.setCustomer(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(username, customer.username) && Objects.equals(customerDetails, customer.customerDetails) && Objects.equals(delivery, customer.delivery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, customerDetails, delivery);
    }
}
