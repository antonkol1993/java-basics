package newDoner.papa;

import newDoner.papa.ingridients.Ingredients;

import java.util.List;

public abstract class AbstractFood implements Food {

    private String name;
    private List<Ingredients> ingredients;

    private double price;

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
