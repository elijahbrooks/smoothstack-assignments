package com.ss.dayfour;

/**
 * @author elijahbrooks
 */
public class Line {

    /**
     *
     * @param x0
     * @param y0
     * @param x1
     * @param y1
     */
    public Line(double x0, double y0, double x1, double y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }

    /**
     *
     * @return slope of line
     */
    public double getSlope() {
        if (x1 == x0) {
            throw new ArithmeticException();
        }
        return (y1 - y0) / (x1 - x0);
    }

    /**
     *
     * @return distance
     */
    public double getDistance() {
        return Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0));
    }

    /**
     *
     * @param l - line object
     * @return - boolean, if parallel to line object
     */
    public boolean parallelTo(Line l) {
        if (Math.abs(getSlope() - l.getSlope()) < .0001) {
            return true;
        }
        return false;
    }

    private double x0, y0, x1, y1;
}