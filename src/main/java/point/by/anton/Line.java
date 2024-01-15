package point.by.anton;

public class Line extends Point implements GeometryUtils {

    private Point firstPointOfLine;
    private Point secondPointOfLine;
    private Point intersectionPoint;



//    private Point secondPointOfLine;

    public Line(Point firstPointOfLine, Point secondPointOfLine) {
        this.firstPointOfLine = firstPointOfLine;
        this.secondPointOfLine = secondPointOfLine;
    }

    public Line(double x1, double y1, double x2, double y2) {
        firstPointOfLine = new Point(x1, y1);
        secondPointOfLine = new Point(x2, y2);
    }


    public boolean isPointOnTheLine(double X, double Y) {
        //       todo
        //        y — y1 = (y2 — y1) / (x2 — x1) * (x — x1)

        if (this.secondPointOfLine.getX() - firstPointOfLine.getX() == 0) {
            throw new RuntimeException("These parameters can't be ZERO ");
        }
        double leftvalue = Y - firstPointOfLine.getY();
        double rightValue = ((double) (secondPointOfLine.getY() - firstPointOfLine.getY()) /
                (secondPointOfLine.getX() - firstPointOfLine.getX()) * (X - firstPointOfLine.getX()));

        System.out.println(leftvalue + "   !!!!  " + rightValue);

        return leftvalue == rightValue;
    }

    public static Point canonicalEquationOfTheLine(Line line1, Line line2) {
        // todo
        //       получение уравнения прямой Y = kx + b ;
        //       k = (y2 — y1) / (x2 — x1)
        //       b = y1 — k * x1.
        //
        //

        double k1 = (line1.secondPointOfLine.getY() - line1.firstPointOfLine.getY()) / (line1.secondPointOfLine.getX() - line1.firstPointOfLine.getX());
        double b1 = (line1.firstPointOfLine.getY() - (k1 * line1.getX()));
        System.out.println("k1= " + k1 + " !!! " + "b1= " + b1);

        double k2 = (line2.secondPointOfLine.getY() - line2.firstPointOfLine.getY()) / (line2.secondPointOfLine.getX() - line2.firstPointOfLine.getX());
        double b2 = (line2.firstPointOfLine.getY() - (k2 * line2.getX()));
        System.out.println("k2= " + k2 + " !!! " + "b2= " + b2);


        if (k1 == k2 && b1 != b2) {
            return null;
        } else if (k1 == k2 && b1 == b2) {
            throw new RuntimeException("These Lines have an infinite number of intersection points");

        }
        double x = (b2 - b1) / (k1 - k2);
        System.out.println();
        System.out.println(k1 + "*x + " + b1 + "==" + k2 + "*x + " + b2);
        //       todo
        //        (k1*x + b1) - ( k2* x + b2 ) = 0
        //        (k1* x) - (k2*x) = b2 - b1
        //        x * ( k1 - k2 ) = b2 - b1
        //        x = (b2 - b 1) / ( k1 - k2)
        double y = k2 * x + b2;
        System.out.println(x);
        System.out.println(y);

        return new Point(x, y);
    }

//    public static boolean isThereAnIntersectionPoint(Line line1, Line line2) {
//        if (canonicalEquationOfTheLine(line1,line2) == null || canonicalEquationOfTheLine(line1, line2) == RuntimeException)
//        return true;
//    }

    public static boolean isThereAnIntersectionPoint2(Line line1, Line line2) {
        double k1 = (line1.secondPointOfLine.getY() - line1.firstPointOfLine.getY()) / (line1.secondPointOfLine.getX() - line1.firstPointOfLine.getX());
        double k2 = (line2.secondPointOfLine.getY() - line2.firstPointOfLine.getY()) / (line2.secondPointOfLine.getX() - line2.firstPointOfLine.getX());

        return k1 == k2;
    }

    public static boolean linesArePerpendicular(Line line1, Line line2) {
        double k1 = (line1.secondPointOfLine.getY() - line1.firstPointOfLine.getY()) / (line1.secondPointOfLine.getX() - line1.firstPointOfLine.getX());


        double k2 = (line2.secondPointOfLine.getY() - line2.firstPointOfLine.getY()) / (line2.secondPointOfLine.getX() - line2.firstPointOfLine.getX());

        boolean answer;
        answer = k1 * k2 == -1;
        return answer;
    }

    public static boolean linesAreParallel(Line line1, Line line2) {
        double k1 = (line1.secondPointOfLine.getY() - line1.firstPointOfLine.getY()) / (line1.secondPointOfLine.getX() - line1.firstPointOfLine.getX());
        double k2 = (line2.secondPointOfLine.getY() - line2.firstPointOfLine.getY()) / (line2.secondPointOfLine.getX() - line2.firstPointOfLine.getX());

        boolean answer;
        answer = k1 == k2 ;
        return answer;
    }






    public static void main(String[] args) {
        // todo
        //       получение уравнения прямой Y = kx + b ;
        //       k = (y2 — y1) / (x2 — x1)
        //       b = y1 — k * x1.
        //        (Y1) = y1 + (y2 — y1) / (x2 — x1) * (X — x1)
        //        (Y2) = y1 + (y2 — y1) / (x2 — x1) * (X — x1)
        //
        //
        Line line1 = new Line(-1, 4, 2, 8);
        Line line2 = new Line(-1, 4, 2, 8);
//        Line.canonicalEquationOfTheLine(line1, line2);

        System.out.println(Line.isThereAnIntersectionPoint(line1,line2));


    }


}
