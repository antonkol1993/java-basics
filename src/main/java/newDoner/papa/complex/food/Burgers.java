package newDoner.papa.complex.food;

import newDoner.papa.ingridients.Ingredients;

import java.util.List;

public class Burgers extends AbstractFood {

    private Ingredients countryFries;


    public Burgers(String name, List<Ingredients> ingredients, double price, boolean countryFries) {
        super(name, ingredients, price);

        if (countryFries) {
            this.countryFries = Ingredients.COUNTRY_FRIES;
        }
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
