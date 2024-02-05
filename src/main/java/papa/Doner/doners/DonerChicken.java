package papa.Doner.doners;

import papa.Doner.Ingridients.IngredientsInDoner;
import papa.Doner.Ingridients.Sauces;
import papa.Doner.ServingQuantity;
import papa.Doner.ShawarmaStandard;
import papa.Doner.cost_and_weight.price.TotalCost;

public class DonerChicken extends ShawarmaStandard {
    private IngredientsInDoner freshCabbage;
    private IngredientsInDoner tomato;
    private IngredientsInDoner pickledCucumber;
    private Sauces redSauce;
    private ServingQuantity servingQuantity;
    private TotalCost totalCost;

    public DonerChicken() {
        super();
        this.servingQuantity = super.getServingQuantity();

        freshCabbage = IngredientsInDoner.FRESH_CABBAGE;
        servingQuantity.setQuantityFreshCabbage(1);

        tomato = IngredientsInDoner.TOMATO;
        servingQuantity.setQuantityTomato(1);

        pickledCucumber = IngredientsInDoner.PICKLED_CUCUMBER;
        servingQuantity.setQuantityPickledCucumber(1);

        redSauce = Sauces.RED_SAUCE;
        servingQuantity.setQuantityRedSauce(1);
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

    @Override
    public ServingQuantity getServingQuantity() {
        return servingQuantity;
    }

    @Override
    public void setServingQuantity(ServingQuantity servingQuantity) {
        this.servingQuantity = servingQuantity;
    }
}
