package com.sp.designpatterns.creational.abstractFactory.flutter;

public class Main {
    public static void main(String[] args) {
        Flutter androidFlutter = new Flutter(new UIFactoryFactory(SupportedPlatform.ANDROID));
        androidFlutter.createComponents();

        Flutter iosFlutter = new Flutter(new UIFactoryFactory(SupportedPlatform.IOS));
        iosFlutter.createComponents();

    }
}
/**
 * What is the Problem we are trying to solve ?
 *  => When there are different classes, with sub variants, it becomes difficult to manage the creation.
 *  => Abstract Factory allows you to pick the kind of factory and create the components belonging to that factory
 *  => Here UIFactoryFactory is the Abstract Factory, based on IOS, ANDROID, it creates the UIFactory. UIFactory can create buttons and menus
 *
 *
 *
 */
