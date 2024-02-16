package com.sp.designpatterns.creational.abstractFactory.furniture;

public class Main {
    public static void main(String[] args) {
        FurnitureFactoryFactory furnitureFactoryFactory = new FurnitureFactoryFactory();
        FurnitureFactory furnitureFactory = furnitureFactoryFactory.getFurnitureFactory(SupportedFunitureTypes.VICTORIAN);
        furnitureFactory.createChair();

        furnitureFactory = furnitureFactoryFactory.getFurnitureFactory(SupportedFunitureTypes.MODERN);
        furnitureFactory.createChair();

    }
}
