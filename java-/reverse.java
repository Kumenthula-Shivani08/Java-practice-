import java.util.Stack;
import java.util.*;

class reverse{
  public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String str = sc.nextLine();
    Stack<Character> stack = new Stack<>();
    for(int i=0;i<str.length();i++){
      stack.push(str.charAt(i));
    }
        System.out.println("Reverse a string");
        while(!stack.empty()){
              System.out.print(stack.pop());

        }

  }
}