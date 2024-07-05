import java.util.*;
import java.util.Stack;

class validParanthesis3{
  public static void main(String[]args){
    String test1 = "()";
    String test2 = "()[]{}";
    String test3 = "(]";
System.out.println( validParanthesis(test2));
System.out.println( validParanthesis(test2));
System.out.println( validParanthesis(test3));

  }
  public static boolean validParanthesis(String s){
    Stack<Character> st = new Stack<>();
    for(char c: s.toCharArray()){
     if(c=='(' || c=='[' ||c=='{'){
      st.push(c);
     }
     else if(c==')' && !st.isEmpty()&& st.peek()=='('){
             st.pop();
     }
     else if(c==']' && !st.isEmpty() && st.peek()=='['){
      st.pop();
     }
     else if(c=='}' && !st.isEmpty() && st.peek()=='{'){
      st.pop();
     }
     else{
      return false;
     }
    }
    return st.isEmpty();
  }
}