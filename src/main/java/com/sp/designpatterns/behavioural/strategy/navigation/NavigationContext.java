package com.sp.designpatterns.behavioural.strategy.navigation;

public class NavigationContext {
    private NavigationStrategy navigationStrategy;

    public NavigationContext(NavigationStrategy navigationStrategy) {
        this.navigationStrategy = navigationStrategy;
    }

    public void doSomething(){
        navigationStrategy.navigate();
    }
}
