package com.sp.designpatterns.creational.abstractFactory.furniture;

public class FurnitureFactoryFactory {

    public FurnitureFactory getFurnitureFactory(SupportedFunitureTypes furnitureTypes) {
        switch (furnitureTypes) {
            case VICTORIAN:
                return new VictorianFurnitureFactory();
            case MODERN:
                return new ModernFurnitureFactory();
        }
        return null;
    }

}
