package ru.stqa.pft.sandbox;

public class My1 {
	
	public static void main(String[] args) {

    System.out.println ("Hello, World!");

		String something = "World";
    System.out.println("Hello" +", "+ something +"!");

    Square s = new Square(5);
    //s.a = 5;
    Rectangle r = new Rectangle(3, 4);

    System.out.println("\nПлощадь квадрата со стороной "+ s.a +" равна "+ s.area() );
    System.out.println("\nПлощадь прямоугольника со сторонами "+ r.a +" и "+r.b+" равна "+ r.area() );

    hello("");
    hello("World1");
    hello("Test");

    	}
	
	public static void hello(String somebody) {

    System.out.println ("\nHello, "+somebody+"!");

  }

 /* public static double area (Square s){
    return s.a*s.a;
  }
  */

  /*public static double area(Rectangle r){
    return r.a*r.b;
  }
  */
}