package com.point.hw.papa.technique.test;

import com.point.hw.papa.technique.test.types.ScreenProps;

public class P extends G {

    private ScreenProps screenProps;

    public P(String name, Double price, ScreenProps screenProps) {
        super(name, price);
        this.screenProps = screenProps;
    }

    public ScreenProps getScreenProps() {
        return screenProps;
    }
}
