package point.by.anton;

public class Main {

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

        System.out.println(Line.isThereAnIntersectionPoint2(line1,line2));



        Point point = new Point(0, 0);

        Point point1 = new Point(2, 2);
        Point point2 = new Point(2, 2);


        Point point3 = new Point(1, 1);

        Line lineError = new Line(point1, point2); //error

        Line line1 = new Line(point, point1);
        Line line2 = new Line(point, point2);
        Line line3 = new Line(point, point3);

        line1.equals(line2); // -> true
        line1.equals(line3); // -> true
        line2.equals(line3); // -> true

        Line3D line3DError = new Line3D(new Point3D(), new Point3D());  //error

        Line3D line3D = new Line3D(new Point3D(), new Point3D(1,1,1));
        double x = line3D.getStartPoint().getX();
        double y = line3D.getStartPoint().getY();
        double z = line3D.getStartPoint().getZ();

    }
}
