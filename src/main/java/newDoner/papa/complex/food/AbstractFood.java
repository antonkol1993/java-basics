package newDoner.papa.complex.food;

import newDoner.papa.ingridients.Ingredients;

import java.util.List;

public abstract class AbstractFood implements ComplexFood {

    private final String name;
    private final List<Ingredients> ingredients;

    private final double price;

    public AbstractFood(String name, List<Ingredients> ingredients, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
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
