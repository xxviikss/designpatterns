package com.company;

public class PaymentByQrFactory implements PaymentFactory{
    @Override
    public Payment createPayment() {
        return new PaymentByQr();
    }
}
