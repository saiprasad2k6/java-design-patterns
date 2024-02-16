package com.sp.designpatterns.structural.decorator.icecream;

public class VannilaIcecream implements Icecream {

    private Icecream icecream;

    public VannilaIcecream() {
    }

    public VannilaIcecream(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        if (icecream != null)
            return 1 + icecream.getCost();
        return 1;
    }

    @Override
    public String getDescription() {
        if (icecream != null)
            return "Vannila Icecream " + icecream.getDescription();
        return "Vannila Icecream";
    }
}
