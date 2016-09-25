package ru.stqa.pft.sandbox;

public class My1 {
	
	public static void main(String[] args) {

    System.out.println ("Hello, World!");

		String something = "World";
    System.out.println("Hello" +", "+ something +"!");

    double a = 2.5;
    double b = 10;

    System.out.println("\nПлощадь квадрата со стороной "+ a +" равна "+ area(a) );
    System.out.println("\nПлощадь прямоугольника со сторонами "+ a +" и "+b+" равна "+ area(a,b) );

    hello("");
    hello("World1");
    hello("Test");

    	}
	
	public static void hello(String somebody) {

    System.out.println ("\nHello, "+somebody+"!");

  }

  public static double area (double l){
    return l*l;
  }

  public static double area(double a, double b){
    return a*b;
  }
}