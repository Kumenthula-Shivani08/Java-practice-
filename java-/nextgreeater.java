import java.util.*;
import java.util.Stack;

class nextgreeater{
public static int[] nextgreater(int []nums){
  int n =  nums.length;
  int nge[] = new int[n];
  Stack <Integer> st  = new Stack<>();
  for(int i=2*n-1;i>=0;i--){
    while(!st.isEmpty() && st.peek()<nums[i%n]){
      st.pop();
    }
    if(i<n){
      if(!st.isEmpty())
        nge[i] = st.peek();
        else
        nge[i] =-1;
      }
      st.push(nums[i%n]);
    }
    return nge;
  }

  public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   System.out.println("no of  elements");
   int n = sc.nextInt();
   int arr[] = new int[n];
     System.out.println("Enter the elements");
     for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
     }

     int arr2[] = nextgreater(arr);
          System.out.println("\nNext greater element");

          for(int i=0;i<arr2.length;i++){
             System.out.println(arr2[i]+" ");

          }

  }
}