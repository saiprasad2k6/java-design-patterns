package com.sp.designpatterns.creational.abstractFactory.furniture;

import com.sp.designpatterns.creational.abstractFactory.furniture.chair.VictorianChair;

public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public void createChair() {
        new VictorianChair().createChair();
    }
}
