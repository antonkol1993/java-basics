package com.point.hw.papa.technique;

public class TechniqueWithScreen extends AbstractTechnique {
    private final double sizeScreen;
    private final int numberOfColours;

    public TechniqueWithScreen(String name, double price, int powerConsumption, double sizeScreen, int numberOfColours) {
        super(name, price, powerConsumption);
        this.sizeScreen = sizeScreen;
        this.numberOfColours = numberOfColours;
    }

    public double getSizeScreen() {
        return sizeScreen;
    }

    public int getNumberOfColours() {
        return numberOfColours;
    }

    @Override
    public String toString() {
        return super.toString() +
                "sizeScreen=" + sizeScreen +
                ", numberOfColours=" + numberOfColours +
                '}';
    }


}
