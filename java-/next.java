import java.util.*;
import java.util.Stack;
class next{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of elements");
    int n = sc.nextInt();
    int arr[] = new int[n];
     System.out.println("Enter the elements");
     for(int i=0;i<n;i++){
       arr[i] = sc.nextInt();
     }
      System.out.println("Array elements");

       for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
     }
     int []arr2 = nextGreaterElement(arr);
     System.out.println("\nNext greater element");
     for(int i=0;i<arr2.length;i++){
           System.out.println(arr2[i]+" ");

     }

     

  }
  public static int[] nextGreaterElement(int [] nums){
    int n =nums.length;
    int nge[] = new int[n];
    Stack <Integer> st =new Stack<>();
    for(int i=2*n-1;i>=0;i--){
      while(st.isEmpty()==false && st.peek()<=nums[i%n]){
        st.pop();
      }
      if(i<n){
        if(st.isEmpty()==false )
        nge[i] = st.peek();
        else
        nge[i]= -1;
      }
      st.push(nums[i%n]);
    }
    return nge;
  }
}