import java.util.*;
import java.util.Stack;

class MinElement4{
Stack<Integer> st = new Stack<>();
Stack<Integer> minSt = new Stack<>();
 public void push(int data){
  int min = data;
  if(!minSt.isEmpty() && min > minSt.peek()){
    min = minSt.peek();
  }
  st.push(data);
  minSt.push(min);
 }
 public void pop(){
  st.pop();
  minSt.pop();
 }
 public int getMinimum(){
  return minSt.peek();
 }
 public static void main(String []args){
  MinElement4 minEle = new MinElement4();
  minEle.push(3);
  minEle.push(2);
  minEle.push(1);
  minEle.push(9);
  minEle.push(2);

  System.out.println(minEle.st);
  System.out.println(minEle.minSt);
  System.out.println(minEle.getMinimum());

  minEle.pop();
  minEle.pop();

System.out.println(minEle.st);
  System.out.println(minEle.minSt);
  System.out.println(minEle.getMinimum());

 }


}