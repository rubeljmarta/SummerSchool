package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.Repository.*;
import com.agency04.sbss.pizza.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

@Component
public class DbInitializer implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    PizzaRepository pizzaRepository;

    @Autowired
    DeliveryRepository deliveryRepository;

    @Autowired
    PizzaOrderRepository pizzaOrderRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        Pizza margherita = new Pizza("Margherita", Set.of(Ingredients.tomato_Sauce,Ingredients.mozzarella, Ingredients.oregano));
        Pizza marinara = new Pizza("Marinara", Set.of(Ingredients.tomato_Sauce,Ingredients.garlic, Ingredients.basil));
        Pizza quattroStagioni = new Pizza("QuattroStagioni", Set.of(Ingredients.tomato_Sauce,Ingredients.mozzarella, Ingredients.mushrooms, Ingredients.ham, Ingredients.artichokes, Ingredients.olives, Ingredients.oregano));


        CustomerDetails customerMarta = new CustomerDetails("Marta","Martic","0977852012");
        CustomerDetails customerMarko = new CustomerDetails("Marko","Markic","0999856985");
        CustomerDetails customerIva = new CustomerDetails("Iva","Ivic","0914523620");
        Customer marta = new Customer("Marta97", customerMarta);
        Customer marko = new Customer("Marko93", customerMarko);
        Customer iva = new Customer("Iva89", customerIva);


        PizzaOrder pizzaOrder1 = new PizzaOrder(margherita,"2", Size.MEDIUM);
        margherita.addPizzaOrder(pizzaOrder1);

        PizzaOrder pizzaOrder2 = new PizzaOrder(marinara,"1", Size.LARGE);
        marinara.addPizzaOrder(pizzaOrder2);

        PizzaOrder pizzaOrder3 = new PizzaOrder(quattroStagioni,"3", Size.SMALL);
        quattroStagioni.addPizzaOrder(pizzaOrder3);


        Delivery delivery1 = new Delivery();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String date1 = "18-08-2021";
        Date date = dateFormat.parse(date1);
        delivery1.setSubmissionDate(date);
        delivery1.addPizzaOrder(pizzaOrder1);
        marta.addDelivery(delivery1);

        Delivery delivery2 = new Delivery();
        String date2 = "20-08-2021";
        Date datee2 = dateFormat.parse(date2);
        delivery2.setSubmissionDate(datee2);
        delivery2.addPizzaOrder(pizzaOrder2);
        marko.addDelivery(delivery2);

        Delivery delivery3 = new Delivery();
        String date3 = "19-08-2021";
        Date datee3 = dateFormat.parse(date2);
        delivery3.setSubmissionDate(datee3);
        delivery3.addPizzaOrder(pizzaOrder3);
        iva.addDelivery(delivery3);


        pizzaRepository.save(margherita);
        pizzaOrderRepository.save(pizzaOrder1);
        deliveryRepository.save(delivery1);
        customerRepository.save(marta);

        pizzaRepository.save(marinara);
        pizzaOrderRepository.save(pizzaOrder2);
        deliveryRepository.save(delivery2);
        customerRepository.save(marko);

        pizzaRepository.save(quattroStagioni);
        pizzaOrderRepository.save(pizzaOrder3);
        deliveryRepository.save(delivery3);
        customerRepository.save(iva);
    }
}