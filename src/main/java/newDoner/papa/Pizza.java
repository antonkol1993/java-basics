package newDoner.papa;

import newDoner.papa.PizzaSize.PizzaSize;
import newDoner.papa.ingridients.Ingredients;

import java.util.List;

import static newDoner.papa.PizzaSize.PizzaSize.*;

public class Pizza {

    private String name;
    private PizzaSize size;
    private double price;
    private int weight;
    private List <Ingredients> ingredients;

    public Pizza(String name, PizzaSize size, double price) {

        this.name = name;
        this.size = size;
        this.price = price;
        this.weight = this.size == BIG ? 900 : this.size == STANDARD ? 700 : this.size == THIN_DOUGH ? 600 : 330;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public String getName() {
        return name;
    }

    public PizzaSize getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }
}
