package com.sp.designpatterns.structural.decorator.icecream;

public class ChocolateIcecream implements Icecream {
    private Icecream icecream;

    public ChocolateIcecream() {

    }

    public ChocolateIcecream(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        if (icecream != null) {
            return 10 + icecream.getCost();
        }
        return 10;
    }

    @Override
    public String getDescription() {
        if (icecream != null)
            return "Chocolate Icecream " + icecream.getDescription();
        return "Chocolate Icecream ";
    }
}
