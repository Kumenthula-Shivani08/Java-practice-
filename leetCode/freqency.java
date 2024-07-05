import java.util.*;
public class freqency{
public static void main(String [] args){
int arr[] = new int[]{1,2,8,3,2,2,2,5,1};
int n = arr.length;
int fr[] = new int[n];
int visited = -1;
for(int i=0;i<n;i++){
 int  count =1;
   for(int j=i+1;j<n;j++){
     if(arr[i]==arr[j]){
        count++;
         fr[j] = visited;

   }
}
   if(fr[i]!=visited)
    fr[i] = count;
}

    System.out.println("----------------------------");
    System.out.println("Element | Frequency");
    System.out.println("----------------------------");
    for(int i=0;i<fr.length;i++){
      if(fr[i]!=visited)
        System.out.println(" "+arr[i]+"    |    "+fr[i]);
      }
    System.out.println("----------------------------");

    }


}
