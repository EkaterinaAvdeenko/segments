package com.epam.rd.autotasks.segments;

class Point {

  Point start;
  Point end;
  private final double x;
  private final double y;


  public Point(final double x, final double y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object other) {
      if (this == other) {
          return true;
      }
      if (other == null || !(other instanceof Point)) {
          return false;
      }
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









