package com.sp.designpatterns.creational.abstractFactory.flutter.components.buttons;

public class IosNormalButton implements Button{
    @Override
    public void createButton() {
        System.out.println("Modern IOS Button");
    }
}
