package newDoner.papa;

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

//        for (int i = 0; i < food.getIngredients().size(); i++) {
//            if (food.getIngredients().get(i) == ingredients[0]) {
//                return true;
//            }
//        }
//        return false;
    }

//    public static boolean ingredientFilters2(Doner object, Ingredients ingredients1, Ingredients ingredients2) {
//        if (object instanceof Doner obj1) {
//
//
//            for (int i = 0; i < obj1.getIngredients().size(); i++) {
//                if (object.getIngredients().get(i) == ingredients1) {
//                    for (int j = 0; j < obj1.getIngredients().size(); j++) {
//                        if (object.getIngredients().get(j) == ingredients2) {
//                            return true;
//                        }
//                    }
//                }
//            }
//        }
//        return false;
//    }

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
