package newDoner.papa.technique;

public class MobilePhone extends TechniqueWithScreen{
    private final int batteryCapacity;

    public MobilePhone(String name,double price, int powerConsumption, double sizeScreen, int numberOfColours, int batteryCapacity) {
        super(name,price, powerConsumption, sizeScreen, numberOfColours);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "MobilePhone{" +
                "batteryCapacity=" + batteryCapacity +
                '}' + "\n";
    }

}
