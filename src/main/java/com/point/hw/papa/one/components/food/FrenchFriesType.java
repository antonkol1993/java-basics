package com.point.hw.papa.one.components.food;

public enum FrenchFriesType implements FoodType {

    SMALL(150),
    MEDIUM(220),
    LARGE(300),
    SNACK_BOX(250);

    private final int weight;

    FrenchFriesType(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
