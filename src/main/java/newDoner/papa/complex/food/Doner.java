package newDoner.papa.complex.food;

import newDoner.papa.ingridients.Ingredients;
import newDoner.papa.ingridients.Sauces;

import java.util.List;

public class Doner extends AbstractFood {
    private List<Sauces> sauces = List.of(Sauces.GARLIC_SAUCE);
    private Integer weight = 400;
    private final String imageURL;

//    private Map<Ingredients,Integer> ingredientsList;


    @Override
    public String toString() {
        return "Doner{" +
                "name='" + getName() + '\'' +
                ", ingredients=" + getIngredients() +
                ", sauces=" + sauces +
                ", weight=" + weight +
                ", price=" + getPrice() +
                ", imageURL='" + imageURL + '\'' +
                '}' + "\n";
    }

    public Doner(String name, List<Ingredients> ingredients, String imageURL) {
        super(name, ingredients, 9.9);
        this.imageURL = imageURL;
    }

    public Doner(String name, List<Ingredients> ingredients, List<Sauces> sauces, Integer weight, Double price, String imageURL) {
        super(name, ingredients, price);
        this.sauces = sauces;
        this.weight = weight;
        this.imageURL = imageURL;
    }

    public List<Sauces> getSauces() {
        return sauces;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getImageURL() {
        return imageURL;
    }

}
