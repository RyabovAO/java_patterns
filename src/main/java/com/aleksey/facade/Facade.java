package com.aleksey.facade;

public class Facade {
    Company company = new Company();
    Reception reception = new Reception();
    Delivery delivery = new Delivery();

    public void placeOrder() {
        reception.acceptOrder();
        reception.checkProductAvailability();

        company.createOrder();
        company.sendOrder();

        delivery.deliveryOrder();
    }
}
