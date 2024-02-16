package com.sp.designpatterns.creational.abstractFactory.flutter.components.menu;

public class IosNormalMenu implements Menu {
    @Override
    public void createMenu() {
        System.out.println("Modern IOS Menu");
    }
}
