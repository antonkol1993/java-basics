package point.by.anton.incorrect;

public record Line(Point startPoint, Point endPoint) {

    @Override
    public boolean equals(Object obj) {

        //canonical
        return false;
    }
}
