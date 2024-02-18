package newDoner.papa.one.components.food;

public class Soda extends OneIngredientFood {

    private final double volume;

    public Soda(String name, int weight, double price, double volume) {
        super(name, weight, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }


}
