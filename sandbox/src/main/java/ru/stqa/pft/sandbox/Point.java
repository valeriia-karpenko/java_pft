package ru.stqa.pft.sandbox;

public class Point {

  public static void main(String[] args) {
    Point p1 = new Point(1.2, 7.8);
    Point p2 = new Point(3.5, 6.0);

    System.out.println("Растояние между точками p1 и p2 = " + distance(p1, p2));

  }
  public double x;
  public double y;
  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public static double distance(Point p1, Point p2) {
    return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
  }
}
