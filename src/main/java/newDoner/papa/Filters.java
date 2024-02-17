package newDoner.papa;

import newDoner.papa.complex.food.ComplexFood;
import newDoner.papa.complex.food.Doner;
import newDoner.papa.ingridients.Ingredients;
import newDoner.papa.ingridients.Sauces;

public class Filters {

    private static boolean instanceOfDoner(Object object) {
        return object instanceof Doner;
    }

    public static boolean ingredientFilter(ComplexFood complexFood, Ingredients... ingredients) {

//        return food.getIngredients().stream()
//                .anyMatch(i -> Arrays.asList(ingredients).contains(i));

//        return food.getIngredients().containsAll(Arrays.asList(ingredients));

        for (int j = 0; j < ingredients.length; j++) {
            boolean hasIngredient = false;
            for (int i = 0; i < complexFood.getIngredients().size() && !hasIngredient; i++) {
                if (complexFood.getIngredients().get(i).equals(ingredients[j])) {
                    hasIngredient = true;
                }
            }
            if (!hasIngredient) {
                return false;
            }
        }

        return true;
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
