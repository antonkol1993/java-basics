package newDoner.papa.complex.food;

import newDoner.papa.PizzaSize.PizzaSize;
import newDoner.papa.complex.food.ingridients.Ingredients;
import newDoner.papa.complex.food.ingridients.Sauces;

import java.util.List;

import static newDoner.papa.PizzaSize.PizzaSize.*;

public class Pizza extends AbstractFood {

    private PizzaSize size;
    private int weight;

    public Pizza(String name, List<Ingredients> ingredients, List<Sauces> sauces, PizzaSize size, double price) {
        super(name, ingredients, sauces, price);
        this.size = size;
        this.weight = this.size == BIG ? 900 : this.size == STANDARD ? 700 : this.size == THIN_DOUGH ? 600 : 330;
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
