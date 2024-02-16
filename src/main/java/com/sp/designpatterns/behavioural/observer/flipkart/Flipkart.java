package com.sp.designpatterns.behavioural.observer.flipkart;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private static Flipkart instance;
    private List<OrderPlacedSubscriber> orderPlacedSubscriberList = new ArrayList<>();

    public static Flipkart getInstance() {
        if (instance == null)
            instance = new Flipkart();
        return instance;
    }

    public void registerOrderPlaceSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscriberList.add(orderPlacedSubscriber);
    }

    public void unRegisterOrderPlaceSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscriberList.remove(orderPlacedSubscriber);
    }


    public void orderPlaced() {
        System.out.println("Order Placed");
        orderPlacedSubscriberList.forEach(OrderPlacedSubscriber::announceOrderPlace);
    }
}
