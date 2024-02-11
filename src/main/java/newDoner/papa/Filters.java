package newDoner.papa;

import newDoner.papa.ingridients.Ingredients;
import newDoner.papa.ingridients.Sauces;

public class Filters {
    public static boolean ingredientFilter(Doner object, Ingredients ingredients) {
        if (object instanceof Doner obj1) {

            for (int i = 0; i < obj1.getIngredients().size(); i++) {

                if (obj1.getIngredients().get(i) == ingredients) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean saucesFilter(Doner object, Sauces sauces) {
        if (object instanceof Doner obj1) {
            for (int i = 0; i < obj1.getSauces().size(); i++) {

                if (obj1.getSauces().get(i) == sauces) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean weightFilter(Doner object, int weight) {
        return object.getWeight() == weight;
    }
    public static boolean priceFilter(Doner object, double price) {
        return object.getPrice() == price;
    }

    public static boolean nameFilter(Doner object, String name) {
        return name.equalsIgnoreCase(object.getName());
    }
    public static boolean urlFilter(Doner object, String imageURL) {
        return imageURL.equalsIgnoreCase(object.getImageURL());
    }





}
