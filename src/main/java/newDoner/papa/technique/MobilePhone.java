package newDoner.papa.technique;

public class MobilePhone extends TechniqueWithScreen{
    private final int batteryCapacity;
    public MobilePhone(double price, int powerConsumption, double sizeScreen, int numberOfColours, int batteryCapacity) {
        super(price, powerConsumption, sizeScreen, numberOfColours);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}
