package newDoner.papa.technique;

public class AbstractTechnique {
    private final double price;
    private final int powerConsumption;

    public AbstractTechnique(double price, int powerConsumption) {
        this.price = price;
        this.powerConsumption = powerConsumption;
    }

    public double getPrice() {
        return price;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }
}
