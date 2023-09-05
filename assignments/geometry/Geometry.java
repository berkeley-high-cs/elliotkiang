/*
 * Just add test methods like the one shown below. (Oh, and maybe fix the bug in
 * subtract.) All numbers are double.
 */

public class Geometry {

  public double midpoint(double one, double two){
    return (one+two)/2;
  }
  public double hypotenuse (double leg1, double leg2){
    return Math. sqrt(leg1*leg1+leg2*leg2);
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
    return π*(radius*radius);
  }


  // Add more methods here ...
}
