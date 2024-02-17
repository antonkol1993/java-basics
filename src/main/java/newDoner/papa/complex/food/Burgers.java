package newDoner.papa.complex.food;

import newDoner.papa.complex.food.ingridients.Ingredients;
import newDoner.papa.complex.food.ingridients.Sauces;

import java.util.List;

public class Burgers extends AbstractFood {

    private Ingredients countryFries;




    public Burgers(String name, List<Ingredients> ingredients, List<Sauces> sauces, boolean countryFries, double price ) {
        super(name, ingredients, sauces, price);

        if (countryFries) {
            this.countryFries = Ingredients.COUNTRY_FRIES;
        }

    }

    @Override
    public String toString() {
        return super.toString() + "Burgers{" +
                "countryFries=" + countryFries +
                '}' + "\n";
    }

    public Ingredients getCountryFries() {
        return countryFries;
    }

    public void setCountryFries(Ingredients countryFries) {
        this.countryFries = countryFries;
    }

    @Override
    public List<Ingredients> getIngredients() {
        return null;
    }
}
