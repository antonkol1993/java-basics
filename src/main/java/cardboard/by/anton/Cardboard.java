package cardboard.by.anton;

public class Cardboard {

    private static int lengthCardboard;
    private static int heightCardboard;
    private static int radiusCircle;

    public Cardboard(int lengthCardboard, int heightCardboard, int radiusCircle) {
        Cardboard.lengthCardboard = lengthCardboard;
        Cardboard.heightCardboard = heightCardboard;
        Cardboard.radiusCircle = radiusCircle;
    }


    public static void setLengthCardboard(int lengthCardboard) {
        Cardboard.lengthCardboard = lengthCardboard;
    }


    public static void setHeightCardboard(int heightCardboard) {
        Cardboard.heightCardboard = heightCardboard;
    }


    public static void setRadiusCircle(int radiusCircle) {
        Cardboard.radiusCircle = radiusCircle;
    }

    public static boolean isCardboardClosed() {
        boolean answer;
        double difference = (Math.pow(radiusCircle, 2) - (Math.pow(lengthCardboard, 2) + Math.pow(heightCardboard, 2)));
        if (lengthCardboard <= 0 || heightCardboard <= 0 || radiusCircle <= 0) {
            throw new RuntimeException("It can't be negative or null");
        } else {
            answer = !(difference >= 0);
            return answer;
        }
    }

}
