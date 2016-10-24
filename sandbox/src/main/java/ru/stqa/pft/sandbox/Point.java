package ru.stqa.pft.sandbox;

/**
 * Created by kirilkar on 25.10.2016.
 */
public class Point {
  public double x;
  public double y;

  public Point(double x, double y){
    this.x=x;
    this.y=y;
  }

  public double distance(Point p2){
    double d = (p2.x-this.x)*(p2.x-this.x) + (p2.y-this.y)*(p2.y-this.y);
    return Math.sqrt(d);
  }

}
