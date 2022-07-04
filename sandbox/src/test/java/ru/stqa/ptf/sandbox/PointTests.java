package ru.stqa.ptf.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;

public class PointTests {
  @Test
  public void testDistance1() {
    Point p1 = new Point(0.0, 3.0);
    Point p2 = new Point(2.0, 3.0);
    Assert.assertEquals(p2.distance(p1), 2.0);
  }

  @Test
  public void testDistance2() {
    Point p1 = new Point(0.0, 0.0);
    Point p2 = new Point(0.0, 0.0);
    Assert.assertEquals(p2.distance(p1), 0.0);
  }

  @Test
  public void testDistance3() {
    Point p1 = new Point(0.0, -3.0);
    Point p2 = new Point(-2.0, -3.0);
    Assert.assertEquals(p2.distance(p1), 2.0);
  }
}