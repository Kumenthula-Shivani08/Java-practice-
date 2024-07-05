import java.util.*;
public class SecondSmall{
 public static int SecondSmall(int n,int arr[]){
 int smallest =arr[0];
for(int i=0;i<n;i++){
  if(smallest >arr[i])
  smallest = arr[i];
}
int sec_smallest = Integer.MAX_VALUE;

for(int i=0;i<n;i++){
  if(arr[i]!=smallest && arr[i]<sec_smallest)
  sec_smallest = arr[i];
}
return sec_smallest;

}
public static void main(String [] args){
int arr[] ={12,13,1,10,34,108};
int n = arr.length;
 System.out.print(SecondSmall(n,arr));

}
}