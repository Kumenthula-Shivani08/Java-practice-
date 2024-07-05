abstract class Shape{
  abstract void draw();
}
class rectangle extends Shape{
  void draw(){
    System.out.println("draw a rectangle");
  }
}
class circle extends Shape{
  void draw(){
    System.out.println("draw a circle");
  }
}
class TestAbstraction1{
  public static void main(String args []){
    Shape s = new  circle();
    s.draw(); 
  }
}