package com.sp.designpatterns.behavioural.observer.flipkart;

public class Main {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        PackingProcessor processor = new PackingProcessor();
        Flipkart.getInstance().orderPlaced();
    }
}
