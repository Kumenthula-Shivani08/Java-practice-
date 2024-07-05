import java.util.*;
class Stack_queue1{
public static void main(String []args){
  Stack s = new Stack();
s.push(3);
s.push(2);
s.push(4);
s.push(1);
System.out.println("Top of the stack "+s.top());
System.out.println("The size of the stack before removing elements: "+s.size());
System.out.println("The deleted element is "+s.pop());
System.out.println("Top of the stack after removing"+s.top());
System.out.println("The size of the stack after removing elements: "+s.size());


}
}
class Stack{
  Queue<Integer> q = new LinkedList<> ();
  void push(int x){
    q.add(x);
    for(int i=0;i<q.size()-1;i++){
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