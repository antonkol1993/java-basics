package newDoner.papa.one.components.food;

public class Soda extends OneIngredientFood {

    private final double volume;
    private final int type;

    public Soda(String name, int type, double price, double volume) {
        super(name, type, price);
        this.type = type;
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public int getType() {
        return type;
    }
}
