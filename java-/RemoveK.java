import java.util.*;
import java.util.Stack;

class RemoveK{
public static String removeKDigits(String num,int k){
  if(k==0){
    return num;
  }
  if(k==num.length())
  return "0";
  Stack<Character> st = new Stack<>();
  int len = num.length();
  for(int i=0;i<len;i++){
    char ch = num.charAt(i);
    while(!st.isEmpty() && k>0 && st.peek()>ch){
      st.pop();
      k--;
    }
    st.push(ch);
  }
  for(int i=0;i<k;i++){
    st.pop();
  }
  StringBuilder sb = new StringBuilder();
  while(!st.isEmpty()){
    sb.append(st.pop());
  }
  sb.reverse();
  while(sb.length()>1 && sb.charAt(0)=='0'){
    sb.deleteCharAt(0);
  }
  return sb.toString();
}
public static void main(String[]args){
   String num1 = "1432219";
        int k1 = 3;
          System.out.println("Input: num = " + num1 + ", k = " + k1 + " -> Output: " + removeKDigits(num1, k1));

}
}