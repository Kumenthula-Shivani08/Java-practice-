import java.util.*;
import java.util.Stack;
class stack{
  static final int Max =1000; 
// int n = 10;
int top;
int a[] = new int [Max];
boolean isEmpty(){
  return(top<0);
}
Stack(){
  top=-1;
}
boolean push(int x){
  if(top > =(Max-1)){
    System.out.println("Stack overflow");
    return false;
  }
  else{
    a[++top] = x;
  System.out.println(x+"is pushed into Stack");

    return true;
  }
}
int pop(){
  if(top<0){
        System.out.println("Stack underflow");
            return 0 ;

  }
  else{
    x = a[top--];
    return x;
  }
}
int peek(){
  if(top<0){
        System.out.println("Stack underflow");
    return 0 ;
         
  }
else{
  int  x = a[top];
    return x;

}
  
}
  int print(){
    for(int i=top ; i>=-1;i--){
          System.out.println(a[i]+" ");

    }
  }



}
class Main1{
    public static void main(String []args){
    Stack  s = new Stack();
    s.push(5);
    s.push(7);
    s.push(2);
        System.out.println(s.pop()+"is poped");
       System.out.println(s.peek()+"is peeked");
        System.out.println(s.print()+"is printed");

  }
}