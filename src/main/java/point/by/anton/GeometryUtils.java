package point.by.anton;

public class GeometryUtils {

    public static boolean isParallel(Line line1, Line line2) {
//        return isParallel(line1.getStartPoint(), line1.getEndPoint() , line2.getStartPoint(), line1.getEndPoint());
        return false;
    }
    public static boolean isParallel(Point startPoint1, Point endPoint1, Point startPoint2, Point endPoint2) {
        return false;
//        return isParallel(new Line(startPoint1, endPoint1), new Line(startPoint2, endPoint2));
    }

//    public static boolean isParallel(x y z x2 y2 z2, x3 y3 z3 x4 y4 z4) {
//        return false;
////        return isParallel(new Line(startPoint1, endPoint1), new Line(startPoint2, endPoint2));
//    }

    public static boolean isCrossed(Line line1, Line line2) {
        return !isParallel(line1, line2);
    }

    public static Point crossedPoint(Line line1, Line line2) {
        if (isParallel(line1, line2)) {
            throw new RuntimeException();
        }

        return new Point();
    }
}
