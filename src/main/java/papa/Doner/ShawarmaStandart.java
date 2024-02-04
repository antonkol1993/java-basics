package papa.Doner;

import papa.Doner.Ingridients.IngredientsInDoner;
import papa.Doner.Ingridients.Sauces;

public abstract class ShawarmaStandart extends ServingQuantity{
    private final IngredientsInDoner flatbread;
    private Sauces garlicSauce ;
    ServingQuantity servingQuantity;

    public ShawarmaStandart() {
        flatbread = IngredientsInDoner.FLATBREAD;
        garlicSauce = Sauces.GARLIC_SAUCE;

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

}
