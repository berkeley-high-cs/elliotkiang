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

}
