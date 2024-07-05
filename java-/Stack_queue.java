import java.util.*;
class Stack_queue{
  public static void main(String[]args){
    Stack s = new Stack();
    s.push(4);
    s.push(14);
    s.push(18);
    s.push(20);
   System.out.println("Top of the stack "+s.top());
    System.out.println("The size of the stack before removing element : "+s.size());
     System.out.println("The deleted elemnent is: "+s.pop());
     System.out.println("Top of the stack after removing element: "+s.top());
      System.out.println("size of the stack after removing element : "+s.size());
  }
}
  class Stack{
    Queue<Integer> q = new LinkedList<>();
   void push(int x){
    q.add(x);
    for(int i=0;i<size()-1;i++){
    q.add(q.remove());
    }
   }
 int pop(){
  return  q.remove();
  }
  int top(){
    return q.peek();
  }
  int size(){
    return q.size();
  }

  }
