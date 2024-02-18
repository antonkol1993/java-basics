package newDoner.papa.one.components.food;

public class OneIngredientFood {

    private final String name;
    private final int weight;
    private final double price;

    public OneIngredientFood(String name, int weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "OneIngredientFood{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}' + "\n";
    }
}
