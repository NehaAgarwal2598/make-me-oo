package org.oop;

public class DistanceAndDirectionCalculator {

    public static double distance(Point from, Point to) {

        return from.getDistanceFrom(to);
    }

    public static double direction(Point from, Point to) {

        return to.getDirectionFrom(from);
    }
}
