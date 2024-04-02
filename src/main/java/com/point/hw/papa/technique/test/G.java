package com.point.hw.papa.technique.test;

public abstract class G {

    private String name;

    public Double price;

    public G(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
