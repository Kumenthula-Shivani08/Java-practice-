import java.util.*;
import java.util.Stack;


class majorityEle{
public static int  majorityElement(int [] num){
  int n = num.length;
 int  majority = num[0],vote = 1;
    for(int i=1;i<n;i++){
       if(vote ==0){
       vote++;
       majority = num[i];
 }
 else if(majority == num[i]){
     vote++;
 }
 else{
   vote --;
 }
    }
    return majority;
}
public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the no of elements");
  int n = sc.nextInt();
  int arr[] = new int[n];
  System.out.println("Enter the elements");

  for(int i=0;i<arr.length;i++){
    arr[i] = sc.nextInt();
  }
  System.out.println("values ");

   for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");

  }
        System.out.println();
    int arr1 = majorityElement(arr);
    
      System.out.println(" Majority = " +arr1);
  

}
}