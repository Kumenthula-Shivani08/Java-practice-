import java.util.*;
class isvalidParanthesis1{
    public static void main(String[]args){
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";  
        System.out.println(ValidParenthesis(test1));
        System.out.println(ValidParenthesis(test2));
        System.out.println(ValidParenthesis(test3));

    }
    public static boolean ValidParenthesis(String s){
        Stack<Character> stack = new   Stack<>();
        for(char c : s.toCharArray())
        {     
            if(c=='(' || c=='[' || c=='{'){
              stack.push(c);
        }
             else if(c==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }
           else if(c==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }
             else if(c=='}' && !stack.isEmpty() && stack.peek()=='{'){
              stack.pop();  
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}