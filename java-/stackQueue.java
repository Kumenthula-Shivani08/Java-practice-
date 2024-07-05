import java.util.*;
// import java.util.Stack;
 class stackQueue{
public static void main(String [] args){
  stack s = new stack();
  s.push(4);
  s.push(5);
  s.push(8);
  System.out.println("top of the stack "+s.top());
  System.out.println("size of the stack "+s.size());
  System.out.println("pop of the stack "+s.pop());
    System.out.println("top of the stack "+s.top());
  System.out.println("size of the stack "+s.size());

}
}
class stack{
  Queue<Integer> q = new LinkedList<>();
  void push(int x){
    q.add(x);
    for(int i=0;i<size()-1;i++){
      q.add(q.remove());
    }
  }
  int pop(){
    return q.remove();
  }
  int top(){
    return q.peek();
  }
  int size(){
    return q.size();
  }
}
