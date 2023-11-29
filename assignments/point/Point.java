public class Point{
  private double x;
  private double y;
  public Point(double numX, double numY){
    x = numX;
    y = numY;
  }
  public double distanceFromOrigin(){
    return(Math.hypot(x,y));
  }
  public static void main (String args[]){
    System.out.println("hello, world!");
    Point ah = new Point(10.0,11.0);
    ah.distanceFromOrigin();
    System.out.println(ah);
  }
}