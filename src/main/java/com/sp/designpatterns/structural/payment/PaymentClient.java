package com.sp.designpatterns.structural.payment;

public class PaymentClient {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor(new YesBankGatewayAdapter());
        processor.processPayments();
    }
}
