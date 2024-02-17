package newDoner.papa.complex.food;

import newDoner.papa.complex.food.ingridients.Ingredients;
import newDoner.papa.complex.food.ingridients.Sauces;

import java.util.List;

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
