package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.service.PizzeriaService;
import com.agency04.sbss.pizza.service.impl.Pizzeria;
import org.springframework.context.annotation.*;

@Configuration
public class PizzaConfig {

    @Bean
    @Primary
    public PizzeriaService pizzeria(){
        return new Pizzeria();
    }

}
