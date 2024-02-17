package newDoner.papa.technique;

public class TechniqueWithScreen extends AbstractTechnique{
    private final double sizeScreen;
    private final int numberOfColours;

    public TechniqueWithScreen(double price, int powerConsumption, double sizeScreen, int numberOfColours) {
        super(price, powerConsumption);
        this.sizeScreen = sizeScreen;
        this.numberOfColours = numberOfColours;
    }

    public double getSizeScreen() {
        return sizeScreen;
    }

    public int getNumberOfColours() {
        return numberOfColours;
    }
}
