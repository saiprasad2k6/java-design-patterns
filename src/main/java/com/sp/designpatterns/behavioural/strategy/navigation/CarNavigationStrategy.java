package com.sp.designpatterns.behavioural.strategy.navigation;

public class CarNavigationStrategy implements NavigationStrategy{

    @Override
    public void navigate() {
        System.out.println("Car navigation");
    }
}
