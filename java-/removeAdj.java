import java.util.*;
import java.util.Stack;

class removeAdj{
  public static String removeAdjDupl(String str){
    Stack <Character> st = new Stack<>();
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<str.length();i++) {
      if(!st.isEmpty() && st.peek()==str.charAt(i)){
        st.pop();
      }
      else{
        st.push(str.charAt(i));
      }
    }
    for(char ch :st){
      sb.append(ch);
    }
    return sb.toString();
  }
  public static void main(String[]args){
String str = "caaabbbc";
String result = removeAdjDupl(str);
System.out.println(result);
  }
}