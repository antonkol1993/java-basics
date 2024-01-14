package point.by.anton;

public class Line extends Point implements GeometryUtils {

    private Point firstPointOfLine;
    private Point secondPointOfLine;
    private Point point;


    private static double x1;
    private static double y1;
    private static double x2;
    private static double y2;


//    private Point secondPointOfLine;

    public Line(Point firstPointOfLine, Point secondPointOfLine) {
        this.firstPointOfLine = firstPointOfLine;
        this.secondPointOfLine = secondPointOfLine;
    }

    public Line(double x1, double y1, double x2, double y2) {
        Line.x1 = x1;
        Line.y1 = y1;
        Line.x2 = x2;
        Line.y2 = y2;
        firstPointOfLine = new Point(x1, y1);
        secondPointOfLine = new Point(x2, y2);
    }

    public Line(double X, Double Y) {
        point = new Point(X,Y);
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

    public static Line canonicalEquationOfTheLine(Line line1, Line line2) {
        // todo
        //       получение уравнения прямой Y = kx + b ;
        //       k = (y2 — y1) / (x2 — x1)
        //       b = y1 — k * x1.
        //        (Y1) = y1 + (y2 — y1) / (x2 — x1) * (X — x1)
        //        (Y2) = y1 + (y2 — y1) / (x2 — x1) * (X — x1)
        //
        //
                double zero = 0;



        double k1 = (line1.secondPointOfLine.getY() - line1.firstPointOfLine.getY()) / (line1.secondPointOfLine.getX() - line1.firstPointOfLine.getX() );
        double b1 = (line1.firstPointOfLine.getY() - (k1 * line1.getX()));
        System.out.println(k1 + "    !!!  " + b1);

        double k2 = (line2.secondPointOfLine.getY() - line2.firstPointOfLine.getY()) / (line2.secondPointOfLine.getX() - line2.firstPointOfLine.getX() );
        double b2 = (line2.firstPointOfLine.getY() - (k2 * line2.getX()));
//        (k1 * x + b1) - (k2 * x + b2) = 0 ;
//        k1*x - k2*x =  b2 -b1;
        double x = (b2 -b1) / (k1-k2);
        System.out.println(x);

        //       todo
        //        (k1*x + b1) - ( k2* x + b2 ) = 0
        //        (k1* x) - (k2*x) = b2 - b1
        //        x * ( k1 - k2 ) = b2 - b1
        //        x = (b2 - b 1) / ( k1 - k2)
        double y = line1.firstPointOfLine.getY() + ((double) (line1.secondPointOfLine.getY() - line1.firstPointOfLine.getY()) /
                (line1.secondPointOfLine.getX() - line1.firstPointOfLine.getX()) * (x - line1.firstPointOfLine.getX()));
        System.out.println(y);

//        if (line1.secondPointOfLine.getX() - line1.firstPointOfLine.getX() == 0 ||
//                line2.secondPointOfLine.getX() - line2.firstPointOfLine.getX() == 0) {
//            throw new RuntimeException("These parameters can't be ZERO ");
//        }
//        double X = 1;
//
//
//
//        double Y1 = line1.firstPointOfLine.getY() + (line1.secondPointOfLine.getY() - line1.firstPointOfLine.getY()) /
//                (line1.secondPointOfLine.getX() - line1.firstPointOfLine.getX()) * (X - line1.firstPointOfLine.getX());
//        double Y2 = line2.firstPointOfLine.getY() + (line2.secondPointOfLine.getY() - line2.firstPointOfLine.getY()) /
//                (line2.secondPointOfLine.getX() - line2.firstPointOfLine.getX()) * (X - line2.firstPointOfLine.getX());
//
//
//        System.out.println(Y + "   !!!!  " + rightValue);
//            if ( Y == rightValue ) {
//               return Object pointCoordinate
//            }
        return line1 ;
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
        Line line1 = new Line(3, 1, 2, 4);
        Line line2 = new Line(5, 2, 4, 8);
        Line.canonicalEquationOfTheLine(line1,line2);




    }


}
