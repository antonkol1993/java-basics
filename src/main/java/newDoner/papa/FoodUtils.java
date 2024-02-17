package newDoner.papa;

import newDoner.papa.complex.food.Burgers;
import newDoner.papa.complex.food.ComplexFood;
import newDoner.papa.complex.food.Doner;
import newDoner.papa.complex.food.Pizza;

import java.util.ArrayList;
import java.util.List;

import static newDoner.papa.PizzaSize.PizzaSize.*;
import static newDoner.papa.PizzaSize.PizzaSize.BIG;
import static newDoner.papa.complex.food.ingridients.Ingredients.*;
import static newDoner.papa.complex.food.ingridients.Ingredients.MUSHROOMS;
import static newDoner.papa.complex.food.ingridients.Ingredients.REGULAR_CHEESE;
import static newDoner.papa.complex.food.ingridients.Sauces.*;
import static newDoner.papa.complex.food.ingridients.Sauces.SWEET_MUSTARD_SAUCE;

public class FoodUtils {

    private static final List<Doner> allDonerList;

    static {
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

        allDonerList = List.of(
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
    }

    private static final List<Burgers> allBurgerList;

    static {
        Burgers cheeseburgerGrill = new Burgers(
                "cheeseburgerGrill",
                List.of(BULK, BEEF_CUTLETE, CHEESE_CHEDDAR, BRISKET, PICKLED_CUCUMBER),
                List.of(GRILL_SAUCE),
                true,
                17.90
        );

        Burgers doubleCheeseburgerGrill = new Burgers(
                "doubleCheeseburgerGrill",
                List.of(BULK, BEEF_CUTLETE, CHEESE_CHEDDAR, BRISKET, PICKLED_CUCUMBER),
                List.of(GRILL_SAUCE),
                false,
                19.5
        );

        Burgers cheeseburgerClassic = new Burgers(
                "cheeseburgerClassic",
                List.of(BULK, BEEF_CUTLETE, CHEESE_CHEDDAR, PICKLED_CUCUMBER, ONION),
                List.of(KETCHUP, SWEET_MUSTARD_SAUCE),
                false,
                12.5
        );
        Burgers doublecheeseburgerClassic = new Burgers(
                "doublecheeseburgerClassic",
                List.of(BULK, BEEF_CUTLETE, CHEESE_CHEDDAR, BRISKET, PICKLED_CUCUMBER),
                List.of(KETCHUP, SWEET_MUSTARD_SAUCE),
                true,
                21.9
        );

        allBurgerList = List.of(
                cheeseburgerGrill,
                doubleCheeseburgerGrill,
                cheeseburgerClassic,
                doublecheeseburgerClassic);
    }

    private static List<Pizza> pizzaList;

    static {
        Pizza tunaWithThousandIslands = new Pizza(
                "tunaWithThousandIslands",
                List.of(TUNA, OLIVES, MOZZARELLA_CHEESE, BASIL, LEMON),
                List.of(THOUSAND_ISLANDS_SAUCE),
                BIG,
                31.9
        );

        Pizza shrimpsPineappleCorn = new Pizza(
                "shrimpsPineappleCorn",
                List.of(SHRIMPS, PINEAPPLE, CORN, MOZZARELLA_CHEESE, BASIL),
                List.of(THOUSAND_ISLANDS_SAUCE),
                STANDARD,
                28.9
        );

        Pizza hamBrisketSausages = new Pizza(
                "hamBrisketSausages",
                List.of(HUNTING_SAUSAGES, BRISKET, HAM, MOZZARELLA_CHEESE, BASIL),
                List.of(THOUSAND_ISLANDS_SAUCE),
                HALF_A_PIZZA,
                14.5
        );
        Pizza mushroomsAndSausages = new Pizza(
                "mushroomsAndSausages",
                List.of(HUNTING_SAUSAGES, MUSHROOMS, ONION, MOZZARELLA_CHEESE, BASIL),
                List.of(MUSHROOM_SAUCE),
                BIG,
                28.9
        );
        Pizza bbqWithOnion = new Pizza(
                "bbqWithOnion",
                List.of(HUNTING_SAUSAGES, BRISKET, PICKLED_CUCUMBER, ONION, MOZZARELLA_CHEESE, BASIL),
                List.of(SWEET_MUSTARD_SAUCE, BARBECUE_SAUCE),
                BIG,
                31.9
        );
        pizzaList = List.of(
                tunaWithThousandIslands,
                shrimpsPineappleCorn,
                hamBrisketSausages,
                mushroomsAndSausages,
                bbqWithOnion
        );

    }

    private static List <List> complexFood = List.of(
                allDonerList,
                allBurgerList,
                pizzaList

        );





    public static List<Doner> allDonerList() {
        return allDonerList;
    }

    public static List<Burgers> allBurgerList() {
        return allBurgerList;
    }

    public static List<Pizza> allPizzaList() {
        return pizzaList;
    }

    public static List<List> allComplexFoodList() {
        return complexFood;
    }
}
