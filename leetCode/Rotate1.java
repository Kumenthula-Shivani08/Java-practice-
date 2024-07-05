class Rotate1{
  public static void main(String []args){
  int  nums[] =new int[] {1,2,3,4,5,6,7}, k = 3;
//  int  nums = {-1,-100,3,99}, k = 2;
rotate(nums ,k);
for(int num:nums){
  System.out.println(num+" ");
        }
    }
  public static void rotate(int[] nums,int k){
        k=k%nums.length;
  int n= nums.length;

    reverseNum(nums,0,n-1);
    reverseNum(nums,0,k-1);
    reverseNum(nums,k,n-1);
    }

 public static void  reverseNum(int nums[],int start,int end ){
    while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

