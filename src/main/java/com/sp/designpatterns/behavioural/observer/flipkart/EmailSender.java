package com.sp.designpatterns.behavioural.observer.flipkart;

public class EmailSender implements OrderPlacedSubscriber {
    public EmailSender() {
        Flipkart.getInstance().registerOrderPlaceSubscriber(this);
    }

    @Override
    public void announceOrderPlace() {
        sendEmail();
    }

    private void sendEmail() {
        System.out.println("Sending Email");
    }
}
