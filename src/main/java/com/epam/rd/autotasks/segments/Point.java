package com.epam.rd.autotasks.segments;

class Point {
    private double x;
    private double y;
    Point start;
    Point end;


    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals (Object other) {
        if (this == other) return true;
        if (other == null || !(other instanceof Point)) return false;
        Point p = (Point) other;
        return x == p.x && y == p.y;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    }









