package newDoner.papa;


import newDoner.papa.ingridients.Ingredients;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static newDoner.papa.ingridients.Ingredients.*;
import static newDoner.papa.ingridients.Sauces.*;


public class Main {





    public static void main(String[] args) {
        List<Doner> donerList = FoodUtils.allDonerList();

        ArrayList<Doner> withChickenDoners = new ArrayList<>();
        int i = 0;
        for (Doner doner : donerList) {
            if (Filters.ingredientFilter(doner, CHICKEN)) {
                withChickenDoners.add(i, doner);
                i++;
            }

        }

        System.out.println(withChickenDoners);

        i = 0;
        List<Doner> withBiff = new ArrayList<>();
        for (Doner doner : donerList) {
            if (Filters.ingredientFilter(doner, REGULAR_BIF)) {

                withBiff.add(i, doner);
                i++;
            }
        }

        System.out.println(withBiff);


        List<Doner> withOnionAndBif = new ArrayList<>();
        for (Doner doner : donerList) {
//            if (Filters.ingredientFilter(doner, new Ingredients[] {REGULAR_BIF, ONION})) {
            if (Filters.ingredientFilter(doner, REGULAR_BIF, ONION)) {
                withBiff.add(i, doner);
                i++;
            }
        }

        System.out.println(withBiff);

        List<Doner> collect = donerList.stream()
                .filter(doner -> doner.getIngredients().contains(CHICKEN))
                .filter(doner -> doner.getIngredients().contains(FLATBREAD))
                .sorted(Comparator.comparingDouble(Doner::getPrice))
                .collect(Collectors.toList());

        System.out.println(collect);


    }


}

