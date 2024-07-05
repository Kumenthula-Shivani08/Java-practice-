import java.util.*;
abstract class shape{
 abstract void draw();

}
class rectangle extends shape{
  void draw (){
    System.out.println("Draw a rectangle");
  }

}
class circle extends circle{
  void draw(){
    System.out.println("Draw a circle");
  }
}
class TestAbstraction{
  public static void main(String [] args){
    shape s = new circle();
    s.draw();
  }
}