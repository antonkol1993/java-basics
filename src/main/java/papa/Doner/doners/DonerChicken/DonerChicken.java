package papa.Doner.doners.DonerChicken;

import papa.Doner.Ingridients.IngredientsInDoner;
import papa.Doner.Ingridients.Sauces;
import papa.Doner.ShawarmaStandart;

public class DonerChicken extends ShawarmaStandart {
    private IngredientsInDoner freshCabbage;
    private IngredientsInDoner tomato;
    private IngredientsInDoner pickledCucumber;
    private Sauces redSauce;

    public DonerChicken() {
        freshCabbage = IngredientsInDoner.FRESH_CABBAGE;
        tomato = IngredientsInDoner.TOMATO;
        pickledCucumber = IngredientsInDoner.PICKLED_CUCUMBER;
        redSauce = Sauces.RED_SAUCE;
    }


    public IngredientsInDoner getFreshCabbage() {
        return freshCabbage;
    }

    public void setFreshCabbage(IngredientsInDoner freshCabbage) {
        this.freshCabbage = freshCabbage;
    }

    public IngredientsInDoner getTomato() {
        return tomato;
    }

    public void setTomato(IngredientsInDoner tomato) {
        this.tomato = tomato;
    }

    public IngredientsInDoner getPickledCucumber() {
        return pickledCucumber;
    }

    public void setPickledCucumber(IngredientsInDoner pickledCucumber) {
        this.pickledCucumber = pickledCucumber;
    }

    public Sauces getRedSauce() {
        return redSauce;
    }

    public void setRedSauce(Sauces redSauce) {
        this.redSauce = redSauce;
    }
}
