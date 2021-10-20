package com.company;

public class Main {

    public static void main(String[] args) {
	PaymentFactory factory= new PaymentByCardFactory();

	Payment payment= factory.createPayment();

	payment.makePayment();
    }
}
