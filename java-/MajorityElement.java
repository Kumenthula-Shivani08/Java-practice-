import java.util.*;
import java.util.Stack;

class MajorityElement{
public static void main(String []args){
  
  Scanner sc = new Scanner(System.in);
    System.out.println("no of  elements");
  int n = sc.nextInt();
    int[] arr = new int[n];

  System.out.println("Enter the elements");
  for(int i=0;i<arr.length;i++){
    arr[i] =  sc.nextInt();
  }
    System.out.println("elements ");

    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");

  }
          System.out.println();

     System.out.println(majorityElement(arr));
//  int majority = majorityElement(arr);
//         System.out.println("Majority Element: " + majority);

  }
     
 


public static int majorityElement(int[] nums){
    int majority = nums[0] ,vote=1;
    for(int i=0;i<nums.length;i++){
      if(vote == 0){
        vote++;
        majority = nums[i];
      }
      else if(majority == nums[i]){
        vote++;
      }
      else{
        vote--;
      }
    }
          return majority;
   }

}