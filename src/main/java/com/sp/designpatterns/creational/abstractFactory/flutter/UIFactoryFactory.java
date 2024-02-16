package com.sp.designpatterns.creational.abstractFactory.flutter;

public class UIFactoryFactory {
    private SupportedPlatform supportedPlatform;

    public UIFactoryFactory(SupportedPlatform supportedPlatform) {
        this.supportedPlatform = supportedPlatform;
    }

    public UIFactory createUIFactory() {
        switch (supportedPlatform) {
            case IOS:
                return new IosUIFactory();
            case ANDROID:
                return new AndroidUIFactory();
        }
        return null;
    }
}
