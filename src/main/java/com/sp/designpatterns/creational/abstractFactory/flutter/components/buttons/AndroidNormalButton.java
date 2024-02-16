package com.sp.designpatterns.creational.abstractFactory.flutter.components.buttons;

public class AndroidNormalButton implements Button{
    @Override
    public void createButton() {
        System.out.println("Normal Android Button");
    }
}
