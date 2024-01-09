package point.by.anton;

public class LineSegment extends Point implements GeometryUtils{

    private Point startPoint;
    private Point endPoint;

    public LineSegment(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public LineSegment(int x1, int y1, int x2, int y2) {
        startPoint = new Point(x1, y1);
        endPoint = new Point(x2, y2);
    }


    public double length() {
        int a = endPoint.getX() - startPoint.getX();
        int b = endPoint.getY() - startPoint.getY();

        return Math.sqrt(a * a + b * b);
    }


    public static boolean compare(LineSegment lineSegment1, LineSegment lineSegment2) {
        boolean inference;
        if (lineSegment1.length() < lineSegment2.length()) {
            System.out.println("Line 1 is less line 2" + " [" + lineSegment1.length() + " < " + lineSegment2.length() + " ]");
            inference = false;
        } else if (lineSegment1.length() > lineSegment2.length()) {
            inference = true;
            System.out.println("Line 1 is more line 2" + " [" + lineSegment1.length() + " > " + lineSegment2.length() + " ]");
        } else {
            System.out.println("Line 1 is equal line 2" + " [" + lineSegment1.length() + " = " + lineSegment2.length() + " ]");
            inference = true;
        }
        return inference;
    }

    @Override
    public boolean linesIntersect( ) {
        int i = 0;
        boolean asddsa = 2 != i;
        return asddsa;
    }

    public static void main(String[] args) {
        LineSegment lineSegment1 = new LineSegment(1,3,-2,6);
        System.out.println(lineSegment1.length());
        LineSegment lineSegment2 = new LineSegment(5,5,2,3);
        System.out.println(lineSegment2.length());
        compare(lineSegment1, lineSegment2);



    }


}


