package point.by.anton;

public class Line extends Point {

    private Point firstPointOfLine;
    private Point secondPointOfLine;


    public Line(Point firstPointOfLine, Point secondPointOfLine) {
        this.firstPointOfLine = firstPointOfLine;
        this.secondPointOfLine = secondPointOfLine;
    }

    public Line(double x1, double y1, double x2, double y2) {
        firstPointOfLine = new Point(x1, y1);
        secondPointOfLine = new Point(x2, y2);
    }

    public Line(double x, double y) {

    }

    public Point getFirstPointOfLine() {
        return firstPointOfLine;
    }

    public Point getSecondPointOfLine() {
        return secondPointOfLine;
    }


    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (int) getFirstPointOfLine().getX();
        result = 31 * result + (int) getFirstPointOfLine().getY();
        result = 31 * result + (int) getSecondPointOfLine().getX();
        result = 31 * result + (int) getSecondPointOfLine().getY();
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Line line = (Line) obj;

        return GeometryUtilsToLine.k(line) == GeometryUtilsToLine.k(this) &&
         GeometryUtilsToLine.b(line) == GeometryUtilsToLine.b(this);
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
        answer = k1 == k2;
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

        System.out.println(Line.isThereAnIntersectionPoint2(line1, line2));


    }


}
