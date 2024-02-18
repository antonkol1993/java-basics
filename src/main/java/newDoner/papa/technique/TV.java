package newDoner.papa.technique;

public class TV extends TechniqueWithScreen{

    public TV(String name,double price, int powerConsumption, double sizeScreen, int numberOfColours) {
        super(name,price, powerConsumption, sizeScreen, numberOfColours);
    }

    @Override
    public String toString() {
        return super.toString() + "\n";
    }
}
