package papa.Doner.doners;

import papa.Doner.Ingridients.IngredientsInDoner;
import papa.Doner.Ingridients.Sauces;
import papa.Doner.ServingQuantity;
import papa.Doner.ShawarmaStandard;

public class DonerRaffleTasty extends ShawarmaStandard {
    private IngredientsInDoner tomato;
    private IngredientsInDoner pickledCucumber;
    private IngredientsInDoner chineseCabbage;
    private IngredientsInDoner marbleBif;
    private Sauces tastySauce;

    private ServingQuantity servingQuantity;


    public DonerRaffleTasty() {
        super();
        this.servingQuantity = super.getServingQuantity();

        tomato = IngredientsInDoner.TOMATO;
        servingQuantity.setQuantityTomato(1);

        pickledCucumber = IngredientsInDoner.PICKLED_CUCUMBER;
        servingQuantity.setQuantityPickledCucumber(1);

        chineseCabbage = IngredientsInDoner.CHINESE_CABBAGE;
        servingQuantity.setQuantityChineseCabbage(1);

        marbleBif = IngredientsInDoner.MARBLE_BIF;
        servingQuantity.setQuantityMarbleBif(1);

        tastySauce = Sauces.TASTY_SAUCE;
        servingQuantity.setQuantityTastySauce(1);


        servingQuantity.setQuantityChicken(0);
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

    public IngredientsInDoner getChineseCabbage() {
        return chineseCabbage;
    }

    public void setChineseCabbage(IngredientsInDoner chineseCabbage) {
        this.chineseCabbage = chineseCabbage;
    }

    public IngredientsInDoner getMarbleBif() {
        return marbleBif;
    }

    public void setMarbleBif(IngredientsInDoner marbleBif) {
        this.marbleBif = marbleBif;
    }

    public Sauces getTastySauce() {
        return tastySauce;
    }

    public void setTastySauce(Sauces tastySauce) {
        this.tastySauce = tastySauce;
    }


    @Override
    public ServingQuantity getServingQuantity() {
        return servingQuantity;
    }

    @Override
    public void setServingQuantity(ServingQuantity servingQuantity) {
        this.servingQuantity = servingQuantity;
    }
}
