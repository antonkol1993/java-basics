package newDoner.papa.complex.food;

import newDoner.papa.PizzaSize.PizzaSize;
import newDoner.papa.ingridients.Ingredients;

import java.util.List;

import static newDoner.papa.PizzaSize.PizzaSize.*;

public class Pizza extends AbstractFood {

    private PizzaSize size;
    private int weight;

    public Pizza(String name, List<Ingredients> ingredients, PizzaSize size, double price) {
        super(name, ingredients, price);
        this.size = size;
        this.weight = this.size == BIG ? 900 : this.size == STANDARD ? 700 : this.size == THIN_DOUGH ? 600 : 330;
    }

    public PizzaSize getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
