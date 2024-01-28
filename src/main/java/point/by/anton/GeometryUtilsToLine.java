package point.by.anton;

public class GeometryUtilsToLine {
    public GeometryUtilsToLine(double x, double y) {
    }

    public static void inputError(Line line) {
        if (line.getSecondPointOfLine().getX() - line.getFirstPointOfLine().getX() == 0) {
            throw new RuntimeException("This difference between parameters can't be ZERO ");
        }
    }


    public boolean isPointOnTheLine(double X, double Y, Line line) {
        //       todo
        //        y — y1 = (y2 — y1) / (x2 — x1) * (x — x1)
        inputError(line);

        double leftValue = Y - line.getFirstPointOfLine().getY();
        double rightValue = ((double) (line.getSecondPointOfLine().getY() - line.getFirstPointOfLine().getY()) /
                (line.getSecondPointOfLine().getX() - line.getFirstPointOfLine().getX()) * (X - line.getFirstPointOfLine().getX()));
        System.out.println(leftValue + "   !!!!  " + rightValue);

        return leftValue == rightValue;
    }


    public static double k(Line line) {
        // todo: определяем "k" в уравнении прямой
        //       k = (y2 — y1) / (x2 — x1)
        inputError(line);

        double k = (line.getSecondPointOfLine().getY() - line.getFirstPointOfLine().getY()) / (line.getSecondPointOfLine().getX() - line.getFirstPointOfLine().getX());
        System.out.println("k= " + k + " !!! ");

        return k;
    }


    public static double b(Line line) {
        // todo: определяем "b" в уравнении прямой
        //       b = y1 — k * x1.
        inputError(line);

        double b = (line.getFirstPointOfLine().getY() - (k(line) * line.getX()));
        return b;
    }

    public static Line canonicalEquation(Line line) {
        // todo
        //       получение уравнения прямой Y = kx + b ;
        inputError(line);

        double y = k(line) * line.getX() + b(line);
        double x = line.getX();
        Line canonicalEquation = new Line(x, y);
        return canonicalEquation;
    }

    public static Point intersectionLinesFormula(Line line1, Line line2) {
        //       todo
        //        (k1*x + b1) - ( k2* x + b2 ) = 0
        //        (k1* x) - (k2*x) = b2 - b1
        //        x * ( k1 - k2 ) = b2 - b1
        //        x = (b2 - b 1) / ( k1 - k2)
        inputError(line1);
        inputError(line2);

        double x = (b(line2) - b(line1)) / (k(line1) - k(line2));
        System.out.println();
        System.out.println(k(line1) + "*x + " + b(line1) + "==" + k(line2) + "*x + " + b(line2));

        double y = k(line2) * x + b(line2);
        System.out.println(x);
        System.out.println(y);
        return new Point(x, y);
    }


    public static Point pointIntersectionLines(Line line1, Line line2) {
        inputError(line1);
        inputError(line2);

        if (isParallel(line1, line2)) {  //todo вроде работает
            System.out.println("parallel");
            return null;
        } else if (canonicalEquation(line1).equals(canonicalEquation(line2))) {
            System.out.println("ERROR infinite points");
            throw new RuntimeException("These Lines have an infinite number of intersection points"); //todo бесконечное число точек пересечения
        }
        return intersectionLinesFormula(line1, line2); //todo координаты точки пересечения прямых
        //todo вроде работает нижний метод,
        // !!!!!переписать equals и должен заработать 2ое условие!!!
    }


    @Override
    public boolean equals(Object obj) {
        Line line2 = null;

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        } else if (obj.getClass() == line2.getClass()){

        }
        Line line = (Line) obj;

        return GeometryUtilsToLine.k(line) == GeometryUtilsToLine.k( this) &&
                GeometryUtilsToLine.b(line) == GeometryUtilsToLine.b(this);
    }


    public static boolean isParallel(Line line1, Line line2) {
        inputError(line1);
        inputError(line2);

        return k(line1) == k(line2) && b(line1) != b(line2); //todo если к1 = к2 и b1 != b2, то прямые параллельны
    }//todo вроде работает


    public static boolean isCrossed(Line line1, Line line2) {
        inputError(line1);
        inputError(line2);

        return !isParallel(line1, line2);
    } //todo вроде работает


    public static void main(String[] args) {
        Line line1 = new Line(new Point(2, 3), new Point(5, 6));
        Line line2 = new Line(new Point(2, 3), new Point(5, 6));
        GeometryUtilsToLine.pointIntersectionLines(line1, line2);
//        System.out.println(GeometryUtilsToLine.isParallel(line1,line2));
//        System.out.println(GeometryUtilsToLine.isCrossed(line1,line2));

    }
}
//todo надо :
// 1. переписать здесь equals
// 2. перепроверить методы в Line
// 3. прочитать ссылку в README про hashcode и equals
