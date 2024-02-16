package com.sp.designpatterns.structural.payment;

public class YesBankGatewayAdapter implements PaymentGateway {
    YesBankPaymentApi yesBankPaymentApi = new YesBankPaymentApi();

    @Override
    public void transfer(String source, String beneficiary, int amount) {
        yesBankPaymentApi.transferCurrency(source, beneficiary, amount);
    }
}
