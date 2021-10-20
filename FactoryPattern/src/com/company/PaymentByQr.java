package com.company;

public class PaymentByQr implements Payment{

    @Override
    public void makePayment() {
        System.out.println("Pay by QR");
    }
}
