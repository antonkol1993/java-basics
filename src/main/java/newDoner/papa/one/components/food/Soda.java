package newDoner.papa.one.components.food;

public class Soda extends OneIngredientFood {

    private final double volume;

    public Soda(String name, FoodType type, double price, double volume) {
        super(name, type, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }


}
