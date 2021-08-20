package com.agency04.sbss.pizza.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "delivery")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private Date submissionDate;

    @JsonIgnore
    @OneToMany(mappedBy = "delivery", cascade = CascadeType.ALL)
    private List<PizzaOrder> pizzaOrder = new ArrayList<PizzaOrder>();

    public Delivery(){}

    public Delivery(Customer customer, Date date) {
        this.customer = customer;
        this.submissionDate = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public List<PizzaOrder> getPizzaOrder() {
        return pizzaOrder;
    }

    public void setPizzaOrder(List<PizzaOrder> pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void addPizzaOrder(PizzaOrder pizzaOrder){
        this.pizzaOrder.add(pizzaOrder);
        pizzaOrder.setDelivery(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Delivery delivery = (Delivery) o;
        return Objects.equals(id, delivery.id) && Objects.equals(customer, delivery.customer) && Objects.equals(submissionDate, delivery.submissionDate) && Objects.equals(pizzaOrder, delivery.pizzaOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, submissionDate, pizzaOrder);
    }
}