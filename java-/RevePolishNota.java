import java.util.*;
import java.util.Stack;

class RevePolishNota{
public int evalRPN(String []tokens){
  Stack<Integer> stack = new Stack<>();
  for(String token :tokens){
  switch( token.charAt(0)){
    case '+':
      int sum = stack.pop() + stack.pop();
      stack.push(sum);
      break;
      case '*':
      int prod = stack.pop() * stack.pop();
      stack.push(prod);

      break;
      case '/':
      int denom = stack.pop();
      int numer =  stack.pop();
      stack.push(numer /denom);
      break;
      default : // - or negative
      if(token.charAt(0)=='-' && token.length()==1){
        int right = stack.pop();
        int left = stack.pop();
          stack.push(left - right);
      }else{
        stack.push(Integer.parseInt(token)); 
      }
      break;

  }
  }
  return stack.pop();
}

public static void main(String[] args) {
        RevePolishNota rpn = new RevePolishNota();
        String[] tokens = {"2", "1", "+", "3", "*"};
        String[] tokens1 = {"4", "13", "5", "/", "+"};
      String[] tokens2 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
      String[] tokens3 = {"2", "3", "4", "*", "+"};

        System.out.println(rpn.evalRPN(tokens));  // Output: 9
        System.out.println(rpn.evalRPN(tokens1));  
        System.out.println(rpn.evalRPN(tokens2));  
        System.out.println(rpn.evalRPN(tokens3)); 

    }
}