import java.util.*;
class Twosum1{
  public static void main(String[] args){
    int [] nums= {2,7,11,15}{
    int target = 9;
    int [] result=
    }
    public static int [] findTwoSum(int []nums , int target){
      Map<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<nums.length;i++){
        int complement = target - nums[i];
      if(map.containsKey(complement)){
        return new int[]{map.get(complement),i}; 
      }
       map.put(nums[i],i);
      }
      throw new IllegalArgumentException("No two sum sol");
    } 
  }
}