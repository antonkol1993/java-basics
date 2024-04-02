package com.point.hw.papa.one.components.food;

public class Snack extends OneIngredientFood {
private int type;
    public Snack(String name, int type, double price) {
        super(name, type, price);
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
