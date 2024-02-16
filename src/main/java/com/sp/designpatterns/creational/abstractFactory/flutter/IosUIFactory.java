package com.sp.designpatterns.creational.abstractFactory.flutter;

import com.sp.designpatterns.creational.abstractFactory.flutter.components.buttons.Button;
import com.sp.designpatterns.creational.abstractFactory.flutter.components.buttons.IosNormalButton;
import com.sp.designpatterns.creational.abstractFactory.flutter.components.menu.IosNormalMenu;
import com.sp.designpatterns.creational.abstractFactory.flutter.components.menu.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public void createButtons() {
        Button button = new IosNormalButton();
        button.createButton();

    }

    @Override
    public void createMenu() {
        Menu menu = new IosNormalMenu();
        menu.createMenu();

    }
}
