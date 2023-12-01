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
  public Point midwayTo(Point p){
    Point midway = new Point((p.x+x)/2,(p.y+y)/2);
    return midway;
  }
  public String toString(){
    return "Point<" + x + "," + y + ">";
  }
  public static void main (String args[]){
    System.out.println("hello, world!");
    Point ah = new Point(300.0,400.0);
    Point origin = new Point(0.0,0.0);
    System.out.println("p:" + ah);
    System.out.println("midoint:" + ah.midwayTo(origin));
    System.out.println("distance from origin:" + ah.distanceFromOrigin());
    System.out.println("to midpoint" + ah.distanceTo(ah.midwayTo(origin)));
  }
}