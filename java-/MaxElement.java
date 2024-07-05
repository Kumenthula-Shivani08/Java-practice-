import java.util.*;
import java.util.Stack;

class MaxElement{
Stack<Integer> st = new Stack<>();
Stack<Integer> maxSt = new Stack<>();
public void push(int data){
  int max = data;
  if(!maxSt.isEmpty() && max < maxSt.peek()){
    max = maxSt.peek();
  }
  st.push(data);
  maxSt.push(max);
}
public void pop(){
  st.pop();
  maxSt.pop();
}
public int getMaximum(){
  return maxSt.peek();
}
public static void main(String []args){
  MaxElement maxEle = new MaxElement();
  maxEle.push(4);
  maxEle.push(3);
  maxEle.push(9);
  maxEle.push(2);
  maxEle.push(8);
  System.out.println(maxEle.st);
   System.out.println(maxEle.maxSt);
   System.out.println(maxEle. getMaximum());
   maxEle.pop();
   maxEle.pop();
   maxEle.pop();

System.out.println(maxEle.st);
   System.out.println(maxEle.maxSt);
   System.out.println(maxEle. getMaximum());

}
}
