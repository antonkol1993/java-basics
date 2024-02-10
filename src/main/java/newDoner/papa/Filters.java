package newDoner.papa;

import newDoner.papa.ingridients.Ingredients;

public class Filters {
    public static boolean isWithIngredient(Object object, Ingredients ingredients) {
        if (object instanceof Doner obj1) {

            for (int i = 0; i < obj1.getIngredients().size(); i++) {

                if (obj1.getIngredients().get(i) == ingredients) {
                    return true;
                }
            }
        }
        return false;
    }
}
