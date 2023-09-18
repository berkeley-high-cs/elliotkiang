public class AssessmentSqrt2 {

  // You will need this constant for one problem.
  public static final double C = 299792458.0;

  // Write methods here. They should be public but not static.
  public double force(double mass, double acceleration){
    return mass*acceleration;
  }
  public double energy(double mass){
    return mass*Math.pow(C,2);
  }
  public double distance(double m, double n){
    return Math.abs(m-n);
  }
  public double distance2d(double x1, double y1, double x2, double y2){
    return Math.sqrt(Math.pow(distance(x1,x2),2)+Math.pow(distance(y1,y2),2));
  }
  public double manhattanDistance(double x1, double y1, double x2, double y2){
    return distance(x1,x2)+distance(y1,y2);
  }
  public String excited(String n){
    return n + "!!!";
  } 
  public String doubleTalk(String n){
    return n+" "+n;
  }
  public String excitedDoubleTalk(String n){
    return doubleTalk(n)+excited("");
  }
  public double toCenter(double lengthSpace, double lengthItem){
    return (lengthSpace-lengthItem)/2;
  }
  public double randomCoordinate(){
    return Math.random()*2;
  }
  public double graphicalCoordinate(double n, double start, double length){
    return distance(n,start); 
  }
}
