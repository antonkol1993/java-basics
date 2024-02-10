package newDoner.papa;


import java.util.ArrayList;
import java.util.List;

import static newDoner.papa.ingridients.Ingredients.*;
import static newDoner.papa.ingridients.Sauces.*;


public class Main {





    public static void main(String[] args) {


        Doner donerBBQ = new Doner("Doner Raffle BBQ",
                List.of(FLATBREAD, TOMATO, PICKLED_CUCUMBER, CHINESE_CABBAGE, MARBLE_BIF),
                List.of(BARBECUE_SAUCE, GARLIC_SAUCE),
                400,
                9.90,
                "URL1");


        Doner donerSwiss = new Doner("Doner Swiss",
                List.of(FLATBREAD, CHICKEN, FRESH_CABBAGE, TOMATO, FRESH_CUCUMBER, CREAM_CHEESE, COWBERRY),
                List.of(COWBERRY_SAUCE, GARLIC_SAUCE),
                400,
                8.90,
                "URL2");

        Doner donerChicken = new Doner("Doner Chicken",
                List.of(FLATBREAD, FRESH_CABBAGE, CHICKEN, TOMATO, PICKLED_CUCUMBER),
                List.of(RED_SAUCE, GARLIC_SAUCE),
                400,
                7.50,
                "URL3");

        Doner donerRaffleTasty = new Doner("Doner Raffle Tasty",
                List.of(FLATBREAD, TOMATO, PICKLED_CUCUMBER, CHINESE_CABBAGE, MARBLE_BIF),
                List.of(TASTY_SAUCE, GARLIC_SAUCE),
                400,
                9.90,
                "URL4");

        Doner donerBif = new Doner("Doner Bif",
                List.of(FLATBREAD, FRESH_CABBAGE, TOMATO, FRESH_CUCUMBER, REGULAR_BIF),
                List.of(SECRET_SAUCE, GARLIC_SAUCE),
                400,
                10.50,
                "URL5");
        Doner donerSlicer = new Doner("doner Slicer",
                List.of(FLATBREAD, CHICKEN, FRESH_CABBAGE, TOMATO, FRESH_CUCUMBER, BRISKET, REGULAR_BIF),
                List.of(BARBECUE_SAUCE, GARLIC_SAUCE),
                550,
                10.50,
                "URL6");

        Doner donerBurpee = new Doner("doner Burpee",
                List.of(FLATBREAD, CHICKEN, FRESH_CABBAGE, TOMATO, FRESH_CUCUMBER, BACON, SESAME),
                List.of(TERIYAKI_SAUCE, GARLIC_SAUCE),
                400,
                8.50,
                "URL7");

        Doner donerStarter = new Doner("doner Starter",
                List.of(FLATBREAD, CHICKEN, FRESH_CABBAGE, TOMATO, PICKLED_CUCUMBER, FRESH_CUCUMBER, BACON, BRISKET),
                List.of(RED_SAUCE, GARLIC_SAUCE),
                400,
                8.50,
                "URL8");

        Doner donerCreamCheese = new Doner("doner CreamCheese",
                List.of(FLATBREAD, CHICKEN, FRESH_CABBAGE, TOMATO, CHINESE_CABBAGE, CREAM_CHEESE),
                List.of(RED_SAUCE, GARLIC_SAUCE),
                550,
                10.50,
                "URL9");

        Doner donerBacon = new Doner("doner Bacon",
                List.of(FLATBREAD, CHICKEN, FRESH_CABBAGE, TOMATO, FRESH_CUCUMBER, BACON),
                List.of(RED_SAUCE, GARLIC_SAUCE),
                550,
                10.50,
                "URL10");

        Doner donerKing = new Doner("doner King",
                List.of(FLATBREAD, CHICKEN, FRESH_CABBAGE, TOMATO, PICKLED_CUCUMBER, HAM, REGULAR_CHEESE, MUSHROOMS),
                List.of(RED_SAUCE, GARLIC_SAUCE),
                800,
                12.90,
                "URL14");


        List<Doner> donerlist = List.of(
                donerBurpee,
                donerBacon,
                donerKing,
                donerCreamCheese,
                donerBif,
                donerSwiss,
                donerSlicer,
                donerStarter,
                donerBBQ,
                donerRaffleTasty,
                donerChicken
        );

        ArrayList<Doner> withChickenDoners = new ArrayList<>();
        int i = 0;
        for (Doner doner : donerlist) {
            if (Filters.isWithIngredient(doner, CHICKEN)) {
                withChickenDoners.add(i, doner);
                i++;
            }

        }

        System.out.println(withChickenDoners);

        i = 0;
        ArrayList<Doner> withBiff = new ArrayList<>();
        for (Doner doner : donerlist) {
            if (Filters.isWithIngredient(doner, REGULAR_BIF)) {

                withBiff.add(i, doner);
                i++;
            }
        }

        System.out.println(withBiff);



    }


}

