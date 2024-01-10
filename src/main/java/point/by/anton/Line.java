package point.by.anton;

public class Line extends Point implements GeometryUtils {

    private Point firstPointOfLine;
    private Point secondPointOfLine;
    private int x1;
    private int y1;
    private int x2;
    private int y2;


//    private Point secondPointOfLine;

    public Line(Point firstPointOfLine, Point secondPointOfLine) {
        this.firstPointOfLine = firstPointOfLine;
        this.secondPointOfLine = secondPointOfLine;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        firstPointOfLine = new Point(x1, y1);
        secondPointOfLine = new Point(x2, y2);

    }

    public double canonicalEquationOfTheLine(double X, double Y) {
        //       todo
        //        y — y1 = (y2 — y1) / (x2 — x1) * (x — x1)
        boolean answer = true;

        double leftvalue = Y - firstPointOfLine.getX();
        double rightValue = ((double) (secondPointOfLine.getY() - firstPointOfLine.getY()) /
                (secondPointOfLine.getX() - firstPointOfLine.getX()) * (X - firstPointOfLine.getX()));

        System.out.println(leftvalue);
        System.out.println(rightValue);


        return Y;
    }

    public static void main(String[] args) {
        Line line = new Line(new Point(2, 3), new Point(4, 5));
        Line line2 = new Line(2, 3, 5, 6);
        line.canonicalEquationOfTheLine(5,10);
    }


}
