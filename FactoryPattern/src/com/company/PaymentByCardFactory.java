package com.company;

public class PaymentByCardFactory implements PaymentFactory{
    @Override
    public Payment createPayment() {
        return new PaymentByCard();
    }
}
