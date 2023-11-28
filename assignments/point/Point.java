public class Point{
  private double x = 0;
  private double y = 0;
  public void con(double numX, double numY){
    x = numX;
    y = numY;
  }
  public static void main (String args[]){
    System.out.println("hello, world!");
    con ah = new con(10,11);
    System.out.println(ah)
  }
}