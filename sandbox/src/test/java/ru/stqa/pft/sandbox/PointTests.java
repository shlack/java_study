package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by kirilkar on 28.10.2016.
 */
public class PointTests {
  @Test
  public void testPoint1(){

    Point p1 = new Point(1, 10);
    Point p2 = new Point(1, 1);

    Assert.assertEquals(p1.distance(p2), 9.0);
  }

  @Test
  public void testPoint2(){

    Point p1 = new Point(1, 10);
    Point p2 = new Point(1, 0);

    Assert.assertEquals(p1.distance(p2), 10.0);
  }

  @Test
  public void testPoint3(){

    Point p1 = new Point(0, 0);
    Point p2 = new Point(0, 0);

    Assert.assertEquals(p1.distance(p2), 0.0);
  }

  @Test
  public void testPoint4(){

    Point p1 = new Point(-1, -10);
    Point p2 = new Point(-1, -1);

    Assert.assertEquals(p1.distance(p2), 9.0);
  }

}
