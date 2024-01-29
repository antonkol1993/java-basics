package point.by.anton.incorrect;

public class LineSegment {

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
        double a = endPoint.getX() - startPoint.getX();
        double b = endPoint.getY() - startPoint.getY();

        return Math.sqrt(a * a + b * b);
    }


    public static boolean compareLines(LineSegment lineSegment1, LineSegment lineSegment2) {
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






    public static void main(String[] args) {
        LineSegment lineSegment1 = new LineSegment(1,3,-2,6);
        System.out.println(lineSegment1.length());
        LineSegment lineSegment2 = new LineSegment(5,5,2,3);

        System.out.println(lineSegment2.length());
        compareLines(lineSegment1, lineSegment2);
        LineSegment lineSegment3 = new LineSegment(new Point(2,3), new Point(4,5));
        LineSegment lineSegment4 = new LineSegment(new Point(1,1), new Point(4,5));
        compareLines(lineSegment2,lineSegment4);




    }


}


