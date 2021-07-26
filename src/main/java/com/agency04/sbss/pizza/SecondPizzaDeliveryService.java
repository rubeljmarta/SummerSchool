package com.agency04.sbss.pizza;

public class SecondPizzaDeliveryService{

    private String name;
    private String address;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    private PizzeriaService pizzeriaService;

    public SecondPizzaDeliveryService(){}

    public void setPizzeriaService(PizzeriaService pizzeriaService) {
        this.pizzeriaService = pizzeriaService;
    }


    public  String orderPizza(Pizza thePizza){
        String order = "Delivering pizza: " + pizzeriaService.makePizza(thePizza) +
                "\n Address: " + pizzeriaService.getAddress() +
                "\n Name: " +  pizzeriaService.getName() +
                "\n Phone Number: " + pizzeriaService.getPhoneNumber() + "\n";

        return order;

    }

}
