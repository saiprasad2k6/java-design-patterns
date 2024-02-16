package com.sp.designpatterns.behavioural.observer.flipkart;

public class InvoiceGenerator implements OrderPlacedSubscriber{
    public InvoiceGenerator() {
        Flipkart.getInstance().registerOrderPlaceSubscriber(this);
    }

    @Override
    public void announceOrderPlace() {
        generateInvoice();
    }

    private void generateInvoice() {
        System.out.println("Invoice Generated");
    }
}
