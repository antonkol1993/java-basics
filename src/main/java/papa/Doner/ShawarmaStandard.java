package papa.Doner;

import papa.Doner.Ingridients.IngredientsInDoner;
import papa.Doner.Ingridients.Sauces;
import papa.Doner.cost_and_weight.quantity.ServingQuantity;

public abstract class ShawarmaStandard extends ServingQuantity {
    private final IngredientsInDoner flatbread;
    private IngredientsInDoner chicken;
    private Sauces garlicSauce;


    private ServingQuantity servingQuantity;


    public ShawarmaStandard() {
        flatbread = IngredientsInDoner.FLATBREAD;
        garlicSauce = Sauces.GARLIC_SAUCE;
        chicken = IngredientsInDoner.CHICKEN;

        servingQuantity = new ServingQuantity();

        servingQuantity.setQuantityFlatbread(1);
        servingQuantity.setQuantityGarlicSauce(1);
        servingQuantity.setQuantityChicken(1);
    }


    public IngredientsInDoner getChicken() {
        return chicken;
    }

    public void setChicken(IngredientsInDoner chicken) {
        this.chicken = chicken;
    }

    public IngredientsInDoner getFlatbread() {
        return flatbread;
    }

    public Sauces getGarlicSauce() {
        return garlicSauce;
    }

    public void setGarlicSauce(Sauces garlicSauce) {
        this.garlicSauce = garlicSauce;
    }

    public ServingQuantity getServingQuantity() {
        return servingQuantity;
    }

    public void setServingQuantity(ServingQuantity servingQuantity) {
        this.servingQuantity = servingQuantity;
    }
}
