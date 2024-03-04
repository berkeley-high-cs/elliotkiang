// Write your classes below this class but leave off the public access
// modifier. (This is because this code will get compiled as a single file and
// there can only be one public class per file.)
class Circle extends Shape{
  String color = "";
  double radius = 0;
  
  Circle(String color, double radius){
    super(color);
    this.color = color;
    this.radius = radius;
  }
  double area(){
    return Math.PI*Math.pow(radius,2);
  }
}
class Rectangle extends Shape{
  String color = "";
  double radius = 0;
  Rectangle(String color, double radius){
    super(color);
    this.color = color;
    this.radius = radius;
  }
  double area(){
    return Math.PI*Math.pow(radius,2);
  }
}