import java.util.*;
class Person{
  private String name;
  private int age;
  public  String getName(){
    return name;

  }
  public void setName(String name){
    this.name = name;

  }
  public int getAge(){
    return age;
  }
  public void setAge(int age){
    this.age = age;
  }

}
class Main1{
  public static void main(String []args){
    Person person = new Person();
    person.setName("priya");
person.setAge(21);   
    System.out.println("name "+person.getName());
    System.out.println("Age"+person.getAge());
  }
}