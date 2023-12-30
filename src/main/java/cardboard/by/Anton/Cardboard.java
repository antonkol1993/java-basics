package cardboard.by.Anton;

public class Cardboard {

    private final int lengthCardboard;
    private final int heightCardboard;
    private final int radiusCircle;

    public Cardboard(int lengthCardboard, int heightCardboard, int radiusCircle) {
        this.lengthCardboard = lengthCardboard;
        this.heightCardboard = heightCardboard;
        this.radiusCircle = radiusCircle;
    }

    public boolean isCardboardClosed() {
        boolean answer;
        int difference = (int) (Math.pow(radiusCircle, 2) - (Math.pow(lengthCardboard, 2) + Math.pow(heightCardboard, 2)));
        if (lengthCardboard <= 0 || heightCardboard <= 0 || radiusCircle <= 0) {
            System.out.println("It can't be negative or null");
            return false;
        } else {
            answer = !(difference >= 0);
            return answer;
        }
    }

    public static void main(String[] args) {
        Cardboard cardboard = new Cardboard(5, 3, 5);

        System.out.println(cardboard.isCardboardClosed());
    }
}
