package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import com.agency04.sbss.pizza.service.PizzeriaService;
import com.agency04.sbss.pizza.service.impl.PizzaDelivery;
import com.agency04.sbss.pizza.service.impl.Pizzeria;
import com.agency04.sbss.pizza.service.impl.PizzeriaSpeedy;
import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("com/agency04/sbss/pizza")
@PropertySource("classpath:application.properties")
public class PizzaConfig {
    @Primary
    @Bean
    public PizzeriaService pizzeriaService1(){
        return new Pizzeria();
    }

    @Bean
    public PizzeriaService pizzeriaService2(){
        return new PizzeriaSpeedy();
    }

    @Bean
    public PizzaDeliveryService pizzaDelivery1(){
        return new PizzaDelivery(pizzeriaService1());
    }
}
