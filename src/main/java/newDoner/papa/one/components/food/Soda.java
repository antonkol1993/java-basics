package newDoner.papa.one.components.food;

public class Soda extends OneIngredientFood {

    private final int volume;

    public Soda(String name, int weight, double price, int volume) {
        super(name, weight, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }


}
