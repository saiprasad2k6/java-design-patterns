package com.sp.designpatterns.structural.payment;

public class PaymentProcessor {
    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void processPayments() {
        //Without Adapter
        //YesBankPaymentApi yesBankPaymentApi = new YesBankPaymentApi();

        paymentGateway.transfer("person1", "person2", 50);
    }
}
