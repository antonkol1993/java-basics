package papa.Doner.doners.DonerChicken;

import papa.Doner.Ingridients.IngredientsInDoner;
import papa.Doner.Ingridients.Sauces;
import papa.Doner.ServingQuantity;
import papa.Doner.ShawarmaStandard;

public class DonerBarbeque extends ShawarmaStandard {

    private IngredientsInDoner tomato;
    private IngredientsInDoner pickledCucumber;
    private IngredientsInDoner chineseCabbage;
    private IngredientsInDoner marbleBif;
    private Sauces barbequeSauce;
    private ServingQuantity servingQuantity;


    public DonerBarbeque() {
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

        barbequeSauce = Sauces.BARBECUE_SAUCE;
        servingQuantity.setQuantityBarbequeSauce(1);


        servingQuantity.setQuantityChicken(0);
    }



}
