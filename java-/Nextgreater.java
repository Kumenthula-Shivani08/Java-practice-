import java.util.*;
import java.util.Stack;

class Nextgreater{
  public static int[] NextgreaterElement(int []num){
    int n = num.length;
    int nge[] = new int[n];
    Stack<Integer> st = new Stack<>();
    for(int i=2*n-1;i>=0;i--){
      while(!st.isEmpty() && st.peek()<=num[i%n]){
        st.pop();
      }
      if(i<n){
        if(!st.isEmpty())
          nge[i] = st.peek();
        else nge[i] = -1;
      }
      st.push(num[i%n]);
    }
    return nge;
    }
    public static void main(String [] args){
      // int []arr = {5,7,1,2,6,0};
      int []arr = {1,2,1};
      int []arr1 = NextgreaterElement(arr);
      for(int i=0;i<arr1.length;i++){
        System.out.println(arr1[i]+" ");

      }
    }
}