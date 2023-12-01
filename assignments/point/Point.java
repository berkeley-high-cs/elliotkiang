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
    System.out.print("p:" + ah);
    System.out.print("midoint:" + ah.midwayTo(origin));
    System.out.print("distance from origin:" + ah.distanceFromOrigin());
    System.out.print("midpoint");
  }
}