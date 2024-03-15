package newDoner.papa.technique;

public class AbstractTechnique {
    private final double price;
    private final int powerConsumption;
    private final String name;


    public AbstractTechnique(String name, double price, int powerConsumption) {
        this.name = name;
        this.price = price;
        this.powerConsumption = powerConsumption;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public String toString() {
        return
                    ", name='" + name + '\'' +
                    "price=" + price +
                    ", powerConsumption=" + powerConsumption +

                    '}';
    }
}
