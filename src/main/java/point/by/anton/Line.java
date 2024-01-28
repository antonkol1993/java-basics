package point.by.anton;

public record Line(Point startPoint, Point endPoint) {

    @Override
    public boolean equals(Object obj) {

        //canonical
        return false;
    }
}
