import java.util.*;
import java.util.Stack;

class RemoveAdjacent{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String str =sc. nextLine();
     System.out.println(str);
    //  String result =  RemoveAdjacent( str);
     System.out.println(removeAdjacent( str));

  
}
public static String removeAdjacent(String str){
  Stack<Character> st = new Stack<>();
  StringBuilder sb = new StringBuilder();
  for(int i=0;i<str.length();i++){
    if(!st.isEmpty() && st.peek()==str.charAt(i)){
      st.pop();

    }
    else{
      st.push(str.charAt(i));
    }
  }
  for(Character ch : st){
     sb.append(ch);
  }
      return sb.toString();

}
  
}
