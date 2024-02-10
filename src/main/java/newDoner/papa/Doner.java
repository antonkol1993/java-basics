package newDoner.papa;

import newDoner.papa.ingridients.Ingredients;
import newDoner.papa.ingridients.Sauces;

import java.util.List;

public class Doner {
    private String name;
    private List<Ingredients> ingredients;
    private List<Sauces> sauces = List.of(Sauces.GARLIC_SAUCE);
    private Integer weight = 400;
    private Double price = 9.90;
    private String imageURL;

//    private Map<Ingredients,Integer> ingredientsList;


    @Override
    public String toString() {
        return "Doner{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                ", sauces=" + sauces +
                ", weight=" + weight +
                ", price=" + price +
                ", imageURL='" + imageURL + '\'' +
                '}' + "\n";
    }

    public Doner(String name, List<Ingredients> ingredients, String imageURL) {
        this.name = name;
        this.ingredients = ingredients;
        this.imageURL = imageURL;
    }

    public Doner(String name, List<Ingredients> ingredients, List<Sauces> sauces, Integer weight, Double price, String imageURL) {
        this.name = name;
        this.ingredients = ingredients;
        this.sauces = sauces;
        this.weight = weight;
        this.price = price;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Sauces> getSauces() {
        return sauces;
    }

    public void setSauces(List<Sauces> sauces) {
        this.sauces = sauces;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
