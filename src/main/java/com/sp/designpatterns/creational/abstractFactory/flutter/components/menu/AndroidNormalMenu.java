package com.sp.designpatterns.creational.abstractFactory.flutter.components.menu;

public class AndroidNormalMenu implements Menu {
    @Override
    public void createMenu() {
        System.out.println("Normal Android Menu");
    }
}
