package com.sp.designpatterns.creational.abstractFactory.flutter;

import com.sp.designpatterns.creational.abstractFactory.flutter.components.buttons.AndroidNormalButton;
import com.sp.designpatterns.creational.abstractFactory.flutter.components.buttons.Button;
import com.sp.designpatterns.creational.abstractFactory.flutter.components.menu.AndroidNormalMenu;
import com.sp.designpatterns.creational.abstractFactory.flutter.components.menu.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public void createButtons() {
        Button button = new AndroidNormalButton();
        button.createButton();

    }

    @Override
    public void createMenu() {
        Menu menu = new AndroidNormalMenu();
        menu.createMenu();

    }
}
