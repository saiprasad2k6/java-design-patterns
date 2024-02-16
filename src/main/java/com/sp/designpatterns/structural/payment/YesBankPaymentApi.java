package com.sp.designpatterns.structural.payment;

import java.util.SortedSet;

public class YesBankPaymentApi {

    public void transferCurrency(String source, String destination, int amount) {
        System.out.println(String.format("%s is the Source , %s is the Destination  is the amount %s", source, destination, amount));

    }
}
