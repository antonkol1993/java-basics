package com.point.hw.papa.complex.food;

import com.point.hw.papa.PizzaSize.PizzaSize;
import com.point.hw.papa.complex.food.ingridients.Ingredients;
import com.point.hw.papa.complex.food.ingridients.Sauces;

import java.util.List;

public class Pizza extends AbstractFood {

    private PizzaSize size;
    private int weight;

    public Pizza(String name, List<Ingredients> ingredients, List<Sauces> sauces, PizzaSize size, double price) {
        super(name, ingredients, sauces, price);
        this.size = size;
        this.weight = this.size == PizzaSize.BIG ? 900 : this.size == PizzaSize.STANDARD ? 700 : this.size == PizzaSize.THIN_DOUGH ? 600 : 330;
    }


    @Override
    public String toString() {
        return super.toString() + "Pizza{" +
                "size=" + size +
                ", weight=" + weight +
                '}' + "\n";

    }


    public PizzaSize getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
