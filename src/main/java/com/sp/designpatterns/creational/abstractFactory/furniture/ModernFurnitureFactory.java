package com.sp.designpatterns.creational.abstractFactory.furniture;

import com.sp.designpatterns.creational.abstractFactory.furniture.chair.ModernChair;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public void createChair() {
        new ModernChair().createChair();
    }
}
