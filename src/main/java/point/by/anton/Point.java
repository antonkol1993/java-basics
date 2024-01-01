package point.by.anton;

public class Point {

    private final int x;
    private final int y;


    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
//        super();
        this.x = x;
        this.y = y;
    }




    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}