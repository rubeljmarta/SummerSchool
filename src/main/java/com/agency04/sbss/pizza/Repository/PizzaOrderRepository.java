package com.agency04.sbss.pizza.Repository;

import com.agency04.sbss.pizza.model.PizzaOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaOrderRepository extends JpaRepository<PizzaOrder,Long> {
}
