package ru.stqa.pft.sandbox;

/**
 * Created by kirilkar on 25.10.2016.
 */
public class Task1_2 {
  public static void main(String[] args) {

    Point p1 = new Point(1, 2);
    Point p2 = new Point(5, 6);

    System.out.println("\nРасстояние между точками с координатами " +
            ""+ "x1="+p1.x+", y1="+p1.y+" и x2="+p2.x+", y2="+p2.y+" равно "+distance(p1, p2) );

  }

  public static double distance(Point p1, Point p2){
    double d = (p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y);
    return Math.sqrt(d);
  }
}