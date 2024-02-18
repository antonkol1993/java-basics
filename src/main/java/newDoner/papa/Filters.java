package newDoner.papa;

import newDoner.papa.complex.food.ComplexFood;
import newDoner.papa.complex.food.Doner;
import newDoner.papa.complex.food.ingridients.Ingredients;
import newDoner.papa.complex.food.ingridients.Sauces;

import java.util.List;

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


    public static List<?> allClassInstances = List.of(
            TechniqueUtils.allTechniqueList(),
            FoodUtils.allComplexFoodList(),
            FoodUtils.alloneIngredientFoodList()
    );


//    public static boolean filterToAll (Object obj) {
//
//        if (obj instanceof AbstractTechnique) {
//            for (int i = 0; i < TechniqueUtils.allTechniqueList().size(); i++) {
//                if(TechniqueUtils.allTechniqueList().get(i).equals(obj)) {
//                    return true;
//                }
//            }
//        }
//        if (obj instanceof AbstractFood){
//            for (int i = 0; i < FoodUtils.allComplexFoodList().size(); i++) {
//
//                    AbstractFood that = (AbstractFood) obj;
//
//                if (Double.compare(FoodUtils.allComplexFoodList().get(i), that.getPrice()) != 0) return false;
//                if (!Objects.equals(name, that.name)) return false;
//                if (!Objects.equals(ingredients, that.ingredients)) return false;
//                return Objects.equals(sauces, that.sauces);
//                if(FoodUtils.allComplexFoodList().get(j).equals(obj)) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }


}
