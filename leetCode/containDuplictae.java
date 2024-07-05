import java.util.*;
class containDuplictae{
  public static void main(String [] args){
  int[]  nums =new int[]{1,2,3,4};
  System.out.println(containDuplictae(nums));
  }
  public static boolean containDuplictae(int[] nums){
    Set<Integer> inset=new  HashSet<>();
    for(int num:nums){
      if(inset.contains(num))
       return true;
       inset.add(num);
      }
      return false;
    }
  }
