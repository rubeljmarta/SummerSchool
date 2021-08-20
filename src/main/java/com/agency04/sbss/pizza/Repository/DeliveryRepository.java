package com.agency04.sbss.pizza.Repository;

import com.agency04.sbss.pizza.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery,Long> {
}
