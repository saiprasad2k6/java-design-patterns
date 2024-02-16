package com.sp.designpatterns.creational.abstractFactory.furniture.chair;

public class ModernChair implements Chair{
    @Override
    public void createChair() {
        System.out.println("Modern Chair");
    }
}
