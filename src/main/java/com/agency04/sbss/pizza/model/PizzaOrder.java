package com.agency04.sbss.pizza.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pizzaOrder")
public class PizzaOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="pizza_id")
    private Pizza pizza;

    private String quantity;

    @Enumerated(EnumType.STRING)
    private Size size;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;


    public PizzaOrder(){}

    public PizzaOrder(Pizza pizza, String quantity, Size size) {
        this.pizza = pizza;
        this.quantity = quantity;
        this.size = size;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PizzaOrder that = (PizzaOrder) o;
        return Objects.equals(id, that.id) && Objects.equals(pizza, that.pizza) && Objects.equals(quantity, that.quantity) && size == that.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pizza, quantity, size);
    }
}
