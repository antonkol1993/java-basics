package point.by.anton.incorrect;

public class GeometryUtilsToLine {
    public GeometryUtilsToLine(double x, double y) {
    }

    private static void validateLine(LineOld line) {
        if (!isValidLine(line)) {
            throw new RuntimeException("This difference between parameters can't be ZERO ");
        }
    }

    public static boolean isValidLine(LineOld line) {
        return line.getSecondPointOfLine().getX() != line.getFirstPointOfLine().getX() ||
                line.getFirstPointOfLine().getY() != line.getSecondPointOfLine().getY();
    }


    public boolean isPointOnTheLine(double X, double Y, LineOld line) {
        //       todo
        //        y — y1 = (y2 — y1) / (x2 — x1) * (x — x1)
        validateLine(line);




        double leftValue = Y - line.getFirstPointOfLine().getY();
        double rightValue = ((double) (line.getSecondPointOfLine().getY() - line.getFirstPointOfLine().getY()) /
                (line.getSecondPointOfLine().getX() - line.getFirstPointOfLine().getX()) * (X - line.getFirstPointOfLine().getX()));
        System.out.println(leftValue + "   !!!!  " + rightValue);

        return leftValue == rightValue;
    }


    public static double k(LineOld line) {
        // todo: определяем "k" в уравнении прямой
        //       k = (y2 — y1) / (x2 — x1)
        validateLine(line);

        double k = (line.getSecondPointOfLine().getY() - line.getFirstPointOfLine().getY()) / (line.getSecondPointOfLine().getX() - line.getFirstPointOfLine().getX());
        System.out.println("k= " + k + " !!! ");

        return k;
    }


    public static double b(LineOld line) {
        // todo: определяем "b" в уравнении прямой
        //       b = y1 — k * x1.
        validateLine(line);

        double b = (line.getFirstPointOfLine().getY() - (k(line) * line.getX()));
        return b;
    }

    /**
     * Canonical equation:
     *
     *  <p> y = k * x + b
     *
     *  <p> определяем "k" в уравнении прямой:
     *
     *  <blockquote><pre>{@code k = (y2 — y1) / (x2 — x1) }</pre></blockquote>
     *
     *  <p> определяем "b" в уравнении прямой:
     *
     *  <p> b = y1 — k * x1
     *
     *  <p> Equals if:
     *
     *  <p> k1 == k2 && b1 == b2
     *
     *
     * @param line1 {x1, y1} {x2, y2}
     * @param line2 {x1, y1} {x2, y2}
     * @return k1 == k2 && b1 == b2
     * @see #k(LineOld)
     * @see #b(LineOld)
     */
    public static boolean canonicalEquation(LineOld line1, LineOld line2) {
        // todo
        //       получение уравнения прямой Y = kx + b ;
        validateLine(line1);

        double k1 = k(line1);
        double b1 = b(line1);

        return k1 == k(line2) && b1 == b(line2);
    }

    public static Point intersectionLinesFormula(LineOld line1, LineOld line2) {
        //       todo
        //        (k1*x + b1) - ( k2* x + b2 ) = 0
        //        (k1* x) - (k2*x) = b2 - b1
        //        x * ( k1 - k2 ) = b2 - b1
        //        x = (b2 - b 1) / ( k1 - k2)
        validateLine(line1);
        validateLine(line2);

        double x = (b(line2) - b(line1)) / (k(line1) - k(line2));
        System.out.println();
        System.out.println(k(line1) + "*x + " + b(line1) + "==" + k(line2) + "*x + " + b(line2));

        double y = k(line2) * x + b(line2);
        System.out.println(x);
        System.out.println(y);
        return new Point(x, y);
    }


    public static Point pointIntersectionLines(LineOld line1, LineOld line2) {
        validateLine(line1);
        validateLine(line2);

//        if (isParallel(line1, line2)) {  //todo вроде работает
//            System.out.println("parallel");
//            return null;
//        } else if (canonicalEquation(line1).equals(canonicalEquation(line2))) {
//            System.out.println("ERROR infinite points");
//            throw new RuntimeException("These Lines have an infinite number of intersection points"); //todo бесконечное число точек пересечения
//        }
        return intersectionLinesFormula(line1, line2); //todo координаты точки пересечения прямых
        //todo вроде работает нижний метод,
        // !!!!!переписать equals и должен заработать 2ое условие!!!
    }


    public static boolean equals(LineOld obj1, LineOld obj2) {
        LineOld line2 = null;


        return GeometryUtilsToLine.k(obj1) == GeometryUtilsToLine.k( obj2) &&
                GeometryUtilsToLine.b(obj1) == GeometryUtilsToLine.b(obj2);
    }


    public static boolean isParallel(LineOld line1, LineOld line2) {
        validateLine(line1);
        validateLine(line2);

        return k(line1) == k(line2) && b(line1) != b(line2); //todo если к1 = к2 и b1 != b2, то прямые параллельны
    }//todo вроде работает


    public static boolean isCrossed(LineOld line1, LineOld line2) {
        validateLine(line1);
        validateLine(line2);

        return !isParallel(line1, line2);
    } //todo вроде работает


    public static void main(String[] args) {
        LineOld line1 = new LineOld(new Point(2, 3), new Point(5, 6));
        LineOld line2 = new LineOld(new Point(2, 3), new Point(5, 6));
        GeometryUtilsToLine.pointIntersectionLines(line1, line2);
//        System.out.println(GeometryUtilsToLine.isParallel(line1,line2));
//        System.out.println(GeometryUtilsToLine.isCrossed(line1,line2));

    }
}
//todo надо :
// 1. переписать здесь equals
// 2. перепроверить методы в Line
// 3. прочитать ссылку в README про hashcode и equals
