package com.company;

public class PaymentByCard implements Payment{


    @Override
    public void makePayment() {
        System.out.println("pay by card");
    }
}
