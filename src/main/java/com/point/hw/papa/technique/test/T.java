package com.point.hw.papa.technique.test;

import com.point.hw.papa.technique.test.types.ScreenProps;

public class T extends G {

    private ScreenProps screenProps;

    public T(String name, Double price, ScreenProps screenProps) {
        super(name, price);
        this.screenProps = screenProps;
    }

    public ScreenProps getScreenProps() {
        return screenProps;
    }
}
