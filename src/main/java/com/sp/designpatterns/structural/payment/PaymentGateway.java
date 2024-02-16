package com.sp.designpatterns.structural.payment;

public interface PaymentGateway {
    void transfer(String source, String beneficiary, int amount);
}
