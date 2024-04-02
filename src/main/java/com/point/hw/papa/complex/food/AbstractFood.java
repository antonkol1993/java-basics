package com.point.hw.papa.complex.food;

import com.point.hw.papa.complex.food.ingridients.Ingredients;
import com.point.hw.papa.complex.food.ingridients.Sauces;

import java.util.List;
import java.util.Objects;

public abstract class AbstractFood implements ComplexFood {

    private final String name;
    private final List<Ingredients> ingredients;
    private final List<Sauces> sauces;
    private final double price;

    public AbstractFood(String name, List<Ingredients> ingredients, List<Sauces> sauces,double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.sauces = sauces;
    }

    public AbstractFood(String name, double price) {
        this.name = name;
        this.price = price;
        sauces = null;
        ingredients = null;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        AbstractFood that = (AbstractFood) object;

        if (Double.compare(price, that.price) != 0) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(ingredients, that.ingredients)) return false;
        return Objects.equals(sauces, that.sauces);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (ingredients != null ? ingredients.hashCode() : 0);
        result = 31 * result + (sauces != null ? sauces.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "AbstractFood{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                ", sauces=" + sauces +
                ", price=" + price +
                '}';
    }

    public List<Sauces> getSauces() {
        return sauces;
    }

    public String getName() {
        return name;
    }

    @Override
    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        return price;
    }
}
