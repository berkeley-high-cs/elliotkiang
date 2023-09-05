/*
 * Just add test methods like the one shown below. (Oh, and maybe fix the bug in
 * subtract.) All numbers are double.
 */

public class Geometry {
  double pi=3.141592653589793;
  public double squared (double squaree){
    return (squaree*squaree);
  }
  public double midpoint(double one, double two){
    return (one+two)/2;
  }
  public double hypotenuse (double leg1, double leg2){
    return Math. sqrt(squared(leg1)+squared(leg2));
  }
  public double perimeterOfSquare(double side) {
    return side * 4;
  }
  public double perimeterOfRectangle(double width, double height){
    return 2*(height+width);
  }
  public double areaOfSquare(double side){
    return side*side;
  }
  public double areaOfRectangle(double width, double height){
    return height*width;
  }
  public double areaOfTriangle(double base, double height){
    return 0.5*base*height;
  }
  public double areaOfTrapezoid(double base1, double base2, double height){
    return 0.5*(base1+base2)*height;
  }
  public double areaOfCircle(double radius){
    return pi*(squared(radius));
  }
  public double surfaceAreaOfSphere(double radius){
    return 4*areaOfCircle(radius);
  }


  // Add more methods here ...
}
