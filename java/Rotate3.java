import java.util.*;
class Rotate3{
  public static void main(String [] args){
    int nums [] = {2,7,11,15};
    int k=3;
    rotate(nums,k);
    for(int num :nums){
      System.out.print(num+" ");
    }
  }
    public static void rotate( int nums [],int k){
      k%=nums.length;
      int n =nums.length; 
      reverseNum(nums,0,n-1);
      reverseNum(nums,0,k-1);
      reverseNum(nums,k,n-1);

    }
   public static void reverseNum(int[] nums ,int start,int end ){
      while(start < end){
      int temp   = nums[start];
      nums[start]  = nums[end];
      nums[end]   = temp;
      end--;
      start++;
    }
    }
  
}