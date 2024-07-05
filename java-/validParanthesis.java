import java.util.Stack;
class validParanthesis{
public static void main(String []args){
String test1="()";
String test2= "()[]{}";
String test3 = "(]";
System.out.println(isValidparenthasis(test1));
System.out.println(isValidparenthasis(test2));
System.out.println(isValidparenthasis(test3));

}
public static boolean isValidparenthasis(String s){
Stack<Character> stack = new Stack<Character>();
  for(char c : s.toCharArray()){
    if(c=='('||c=='{'||c=='['){
      stack.push(c);
    }
    else if(c==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
    }
    else if(c==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
    }
    else if(c=='}' && !stack.isEmpty() && stack.peek()=='{')
    {
                stack.pop();
    }
    else{
                return false;
            }
        }
        
        return stack.isEmpty();
    }
}