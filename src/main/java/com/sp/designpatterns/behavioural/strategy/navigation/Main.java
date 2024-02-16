package com.sp.designpatterns.behavioural.strategy.navigation;

public class Main {
    public static void main(String[] args) {
        NavigationContext context = new NavigationContext(new WalkingNavigationStrategy());
        context.doSomething();
    }
}
