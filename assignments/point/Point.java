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
  public double distanceTo(Point p){
    return(Math.hypot(p.x-x,p.y-y));
  }
  public void move(double xChange, double yChange){
    x+=xChange;
    y+=yChange;
  }
  public static void main (String args[]){
    System.out.println("hello, world!");
    Point ah = new Point(10.0,11.0);
    System.out.println(ah);
  }
}