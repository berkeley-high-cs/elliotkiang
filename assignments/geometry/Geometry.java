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

  // Add more methods here ...
}
