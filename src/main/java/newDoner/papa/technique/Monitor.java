package newDoner.papa.technique;

public class Monitor extends TechniqueWithScreen{
    public Monitor(String name,double price, int powerConsumption, double sizeScreen, int numberOfColours) {
        super(name,price, powerConsumption, sizeScreen, numberOfColours);
    }

    @Override
    public String toString() {
        return super.toString() + "\n";
    }
}
