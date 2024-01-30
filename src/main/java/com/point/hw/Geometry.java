package com.point.hw;

public class Geometry {


    /**
     * This method is validating the line in the method
     * If the coordinates of the start and end points of
     * the line are equal, the method will throw an exception.
     */
    private boolean validateLine(Line line) {
        if (line.getStartLine().getX() == line.getEndLine().getX() &&
                line.getStartLine().getY() == line.getEndLine().getY()) {
            throw new RuntimeException("\"Invalidate the next one line or both lines\"");
        }
        return true;
    }
    /**
     * This method defines 'k' in the equation
     */
    private double K(Line line) {
        // todo: определяем "k" в уравнении прямой
        //       k = (y2 — y1) / (x2 — x1)
        validateLine(line);

        return (line.getEndLine().getY() - line.getStartLine().getY()) /
                (line.getEndLine().getX() - line.getStartLine().getX());
    }
    /**
     * This method defines 'b' in the equation
     */
    private double B(Line line) {
        // todo: определяем "b" в уравнении прямой
        //       b = y1 — k * x1.
        validateLine(line);
        return (line.getStartLine().getY() - (K(line) * line.getStartLine().getX()));
    }
    /**
     * This method defines parallel two lines.
     * If {@link Line line1} method {@link   Line k} will equal {@link Line line2} method {@link Line k},
     * so these lines are parallel.
     */
    public boolean isParallel(Line line1, Line line2) {
        validateLine(line1);
        validateLine(line2);
        return K(line1) == K(line2);
    }



    public boolean isCrossed(Line line1, Line line2) {
        return false;
    }

    public Point crossPoint(Line line1, Line line2) {
        return null;
    }


    //todo: если сделал все остальное
    public boolean contains(Line line, Point point) {
        return false;
    }
}
