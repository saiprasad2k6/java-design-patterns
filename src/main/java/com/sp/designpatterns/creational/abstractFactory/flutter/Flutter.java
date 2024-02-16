package com.sp.designpatterns.creational.abstractFactory.flutter;

public class Flutter {
    UIFactoryFactory uiFactoryFactory;

    public Flutter(UIFactoryFactory uiFactoryFactory) {
        this.uiFactoryFactory = uiFactoryFactory;
    }

    public void createComponents() {
        UIFactory uiFactory = uiFactoryFactory.createUIFactory();
        uiFactory.createButtons();
        uiFactory.createMenu();
    }
}
