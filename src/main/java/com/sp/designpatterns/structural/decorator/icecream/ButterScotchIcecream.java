package com.sp.designpatterns.structural.decorator.icecream;

public class ButterScotchIcecream implements Icecream {
    private Icecream icecream;

    public ButterScotchIcecream() {
    }

    public ButterScotchIcecream(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        if (icecream != null) {
            return 5 + icecream.getCost();
        }
        return 5;
    }

    @Override
    public String getDescription() {
        if (icecream != null) {
            return "Butter Scotch Icecream " + icecream.getDescription();
        }
        return "Butter Scotch Icecream";

    }
}
