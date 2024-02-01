package com.point.hw;

public class Geometry {


    /**
     * This method is validating the line in the method
     * If the coordinates of the start and end points of
     * the line are equal, the method will throw an exception.
     *
     * @param  line
     */
    private void validateLine(Line line) {
        if (line.getStartPoint().getX() == line.getEndPoint().getX() &&
                line.getStartPoint().getY() == line.getEndPoint().getY()) {
            throw new RuntimeException("\"Invalidate the next one line or both lines\"");
        }
    }

    /**
     *
     * This method defines 'k' in the equation.
     * <p>
     * Define "k" in the equation of the line <ul>
     * <blockquote><pre>{@code k = (y2 — y1) / (x2 — x1)}</blockquote>
     * @param line
     * @return double
     */
    public double K(Line line) {

        validateLine(line);

        return (line.getEndPoint().getY() - line.getStartPoint().getY()) /
                (line.getEndPoint().getX() - line.getStartPoint().getX());
    }

    /**
     * This method defines 'b' in the equation
     * Define "b" in the equation of the line. <ul>
     * <blockquote><pre>{@code b = y1 — k * x1}</blockquote>
     *
     * @param line
     * @return double
     */
    public double B(Line line) {

        validateLine(line);
        return (line.getStartPoint().getY() - (K(line) * line.getStartPoint().getX()));
    }

    /**
     * This method defines parallel two lines.
     * If {@link Line line1} method {@link   Line k} will equal {@link Line line2} method {@link Line k},
     * so these lines are parallel.
     *
     * @param line1
     * @param line2
     * @return boolean
     */
    public boolean isParallel(Line line1, Line line2) {
        validateLine(line1);
        validateLine(line2);
        return K(line1) == K(line2);
    }

    /**
     * If two lines are not parallel, then they intersect.
     *
     * @param line1
     * @param line2
     * @return boolean
     */
    public boolean isCrossed(Line line1, Line line2) {
        return !isParallel(line1, line2);
    }

    /**
     *  This method define the point so intersecting lines
     *  I'm checking for: <ul>
     *      1. No intersection point  <ul>
     *      2. Infinitely many points of intersection <ul>
     *      3. Point is "result coordinates(x,y): <ul>
     *         <blockquote><pre>{@code
     *         (k1 * x + b1) - ( k2 * x + b2 ) = 0
     *         (k1 * x) - (k2 * x) = b2 - b1
     *         x * ( k1 - k2 ) = b2 - b1
     *         x = (b2 - b1) / ( k1 - k2)
     *         y = k(x1) * x1 + b1 or y = k(x2) * x2 + b2 }</blockquote>
     *
     *
     *
     * @param line1
     * @param line2
     * @return Point value
     */
    public Point crossPoint(Line line1, Line line2) {

        if (B(line1) == B(line2) && K(line1) == K(line2)) {
            throw new RuntimeException("These lines have infinitely many points of intersection");
        } else if (K(line1) == K(line2) && B(line1) != B(line2)) {
            return null;
        } double x = (B(line2) - B(line1)) / (K(line1) - K(line2));
        double y = K(line2) * x + B(line2);
        // System.out.println("x = " + x + ";  y = " + y );
        return new Point(x,y);
    }


    //todo: если сделал все остальное
    public boolean contains(Line line, Point point) {

        return false;
    }
}
