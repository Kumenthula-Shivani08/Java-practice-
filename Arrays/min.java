import java.util.*;
public class min{
public static void main(String [] args){
int arr[] ={12,13,1,10,34,108};
int min =arr[0];
int max=arr[0];
for(int i=0;i<arr.length;i++){
  if(max < arr[i]){
    max = arr[i];
  }
}
for(int i=0;i<arr.length;i++){
  if(min > arr[i]){
    min = arr[i];
  }
}
         System.out.println(min);
             System.out.print(max);

}
}