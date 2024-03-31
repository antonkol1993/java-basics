package newDoner.papa.one.components.food;

import newDoner.papa.complex.food.AbstractFood;
import newDoner.papa.complex.food.ingridients.Ingredients;
import newDoner.papa.complex.food.ingridients.Sauces;

import java.util.List;

public abstract class OneIngredientFood extends AbstractFood {

    private final String name;

    private final double price;

    public OneIngredientFood(String name, int type, double price) {
       super(name, price);
        this.name = name;
        this.price = price;
    }

    public OneIngredientFood(String name, List<Ingredients> ingredients, List<Sauces> sauces, double price, String name1, double price1) {
        super(name, ingredients, sauces, price);
        this.name = name1;
        this.price = price1;
    }

    public OneIngredientFood(String name, double price, String name1, double price1) {
        super(name, price);
        this.name = name1;
        this.price = price1;
    }

    public String getName() {
        return name;
    }



    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "OneIngredientFood{" +
                "name='" + name + '\'' +
                ","  +
                ", price=" + price +
                '}' + "\n";
    }
}
