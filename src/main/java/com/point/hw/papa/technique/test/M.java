package com.point.hw.papa.technique.test;

import com.point.hw.papa.technique.test.types.ScreenProps;

public class M extends G {

    private ScreenProps screenProps;

    public M(String name, Double price, ScreenProps screenProps) {
        super(name, price);
        this.screenProps = screenProps;
    }

    public ScreenProps getScreenProps() {
        return screenProps;
    }
}
