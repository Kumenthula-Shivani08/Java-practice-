import java.util.*;
class stack{
  static final int MAX = 1000;
  // int n=50;
  int top;
  int a[] = new int[MAX];
  boolean isEmpty(){
    return(top < 0);
  }
  stack()
  {
    top = -1;
  }
  boolean push(int x)
  {
    if(top >= (MAX - 1)){
      System.out.println("Stack overflow");
      return false;
    }
    else{
      a[++top]=x;
      System.out.println(x+"  pushed into stack");
      return true;
    }
  }
  int pop()
  {
    if(top<0){
            System.out.println("Stack underflow");
           return 0;
    }
    else{
     int x = a[top--];
     return x;
    }
  }
  int peek()
  {
    if(top<0){
        System.out.println("Stack underflow");
        return 0;
    }
    else{
      int x = a[top];
      return x;
    }
  }
  void print(){
    for(int i= top ;i>-1;i--){
        System.out.println(" "+a[i]);
    }
  }
}
class Main{
  public static void main(String [] args){
    stack s = new stack();
    s.push(10);
    s.push(20);
    s.push(30);
    // System.out.println(s.push(10)+" pushed from the stack");
    // System.out.println(s.push(20)+" pushed from the stack");
    // System.out.println(s.push(30)+" pushed from the stack");

        System.out.println(s.pop()+" popped from the stack");
    System.out.println("Top element is: "+s.peek());
    System.out.println("Elements present in stack");
    s.print();


  }
}




