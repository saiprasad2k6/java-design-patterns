package com.sp.designpatterns.creational.abstractFactory.furniture.chair;

import java.util.Calendar;

public class VictorianChair implements Chair {
    @Override
    public void createChair() {
        System.out.println("Victorian Chair");
    }
}
