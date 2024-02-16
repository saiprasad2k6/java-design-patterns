package com.sp.designpatterns.structural.decorator.icecream;

public class IcecreamShop {
    public static void main(String[] args) {
        Icecream icecream = new ChocolateIcecream(new VannilaIcecream(new ButterScotchIcecream()));
        System.out.println(icecream.getDescription() + " is the Icecream");
        System.out.println(icecream.getCost() + " is the Cost");

    }
}
