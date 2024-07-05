class MoveZero{
  public static void main(String []args){
   int []nums = new int[]{0,1,0,3,12};
   nums =MoveZero(nums);
   for(int num :nums)
    System.out.print(num+" ");
  }
  public static int[] MoveZero(int[] nums)
  {
        int insertionPosition =0;
     for(int i=0;i<nums.length;i++){
      if(nums[i]!=0){
        nums[insertionPosition]=nums[i];
        insertionPosition++;
      }
     }
     while(insertionPosition<nums.length){
      nums[insertionPosition++]=0;
     }
            return nums;

  }


}