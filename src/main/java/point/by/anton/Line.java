package point.by.anton;

public class Line {

    private final Point startPoint;
    private final Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }


    public Line(Point endPoint) {
        this(new Point(1, 1), endPoint);

    }

    public double length() {
        int a = endPoint.getX() - startPoint.getX();
        int b = endPoint.getY() - startPoint.getY();

        return Math.sqrt(a * a + b * b);
    }

    public static double lengthWithParameters(int startX, int startY, int endX, int endY) {

        int a = endX - startX;
        int b = endY - startY;

        return Math.sqrt(a * a + b * b);
    }

    public static boolean compare(Line line1, Line line2) {
        boolean inference;
        if (line1.length() < line2.length()) {
            System.out.println("Line 1 is less line 2" + " [" + line1.length() + " < " + line2.length() + " ]");
            inference = false;
        } else if (line1.length() > line2.length()) {
            inference = true;
            System.out.println("Line 1 is more line 2" + " [" + line1.length() + " > " + line2.length() + " ]");
        } else {
            System.out.println("Line 1 is equal line 2" + " [" + line1.length() + " = " + line2.length() + " ]");
            inference = true;
        }
        return inference;
    }

    public static void main(String[] args) {
        Point startPoint = new Point(2, 3);
        Point endPoint = new Point(4, 5);
        Line line = new Line(startPoint, endPoint);
        System.out.println(line.length());

        Point startPoint2 = new Point(4, 5);
        Point endPoint2 = new Point(3, 3);
        Line line2 = new Line(startPoint2, endPoint2);
        System.out.println(line2.length());
        System.out.println(Line.compare(line, line2));

        Line line3 = new Line(new Point(2, 7));
        System.out.println(line3.length());

        System.out.println(Line.lengthWithParameters(2, 3, 5, 6));
        Line line4 = new Line(new Point());
        System.out.println(line4.length());

    }


}


