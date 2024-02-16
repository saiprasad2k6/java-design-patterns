package com.sp.designpatterns.behavioural.strategy.navigation;

public class WalkingNavigationStrategy implements NavigationStrategy{
    @Override
    public void navigate() {
        System.out.println("Walking Navigation");
    }
}
