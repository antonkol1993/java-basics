package newDoner.papa;

import newDoner.papa.ingridients.Ingredients;
import newDoner.papa.ingridients.Sauces;

public class Filters {

    private static boolean instanceOfDoner(Object object) {
        return object instanceof Doner;
    }

    public static boolean ingredientFilter(Object object, Ingredients ingredient) {
        if (instanceOfDoner(object)) {
            Doner obj1 = (Doner) object;
            for (int i = 0; i < obj1.getIngredients().size(); i++) {

                if (obj1.getIngredients().get(i) == ingredient) {
                    return true;
                }
            }
        } else {
            Pizza obj1 = (Pizza) object;
            for (int i = 0; i < obj1.getIngredients().size(); i++) {

                if (obj1.getIngredients().get(i) == ingredient) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean ingredientFilters2(Doner object, Ingredients ingredients1, Ingredients ingredients2) {
        if (object instanceof Doner obj1) {


            for (int i = 0; i < obj1.getIngredients().size(); i++) {
                if (object.getIngredients().get(i) == ingredients1) {
                    for (int j = 0; j < obj1.getIngredients().size(); j++) {
                        if (object.getIngredients().get(j) == ingredients2) {
                            return true;
                        }
                    }
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
