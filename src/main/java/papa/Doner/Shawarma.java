package papa.Doner;

import papa.Doner.Ingridients.IngredientsInDoner;
import papa.Doner.Ingridients.Sauces;

public abstract class  Shawarma {

    public Shawarma() {
        IngredientsInDoner flatbread = IngredientsInDoner.FLATBREAD;
        Sauces garlicSauce = Sauces.GARLIC_SAUCE;
    }

}
