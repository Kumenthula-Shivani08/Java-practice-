import java.util.*;
import java.util.Stack;

 
  class Nextgreater3{
     public static void main(String[]args){
     int arr[] ={5,7,1,2,6,0};
  int arr2[] = nextgreater(arr);
  System.out.println("the next -----");
  for(int i=0;i<arr2.length;i++){
      System.out.println(arr2[i]+"");

  }

  }
public static int[] nextgreater(int [] nums){
  int n =  nums.length;
  int nge[] = new int[n];
  Stack <Integer> s = new Stack<>();
  for(int i=2*n-1 ;i>=0;i--){
    while(!s.isEmpty() && s.peek()<=nums[i%n]){
         s.pop();
    }
    if(i<n){
      if(!s.isEmpty())
      nge[i] =s.peek();
      else
      nge[i] = -1;
    }
      s.push(nums [i%n]);
    }
  
    return nge;
  
}
  }