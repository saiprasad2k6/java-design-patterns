package com.sp.designpatterns.behavioural.observer.flipkart;

public class PackingProcessor implements OrderPlacedSubscriber {
    public PackingProcessor() {
        Flipkart.getInstance().registerOrderPlaceSubscriber(this);
    }

    @Override
    public void announceOrderPlace() {
        packThings();
    }

    private void packThings() {
        System.out.println("Packing Things");
    }
}
