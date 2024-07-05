import java.util.*;
public class Armstrong{
  public static void main(String [] args){
    int sum=0,num=153,r;
    int temp;
    temp=num;
    while(temp!=0){
      r=temp%10;
      sum=sum+r*r*r;
      temp/=10;

    }
    if(num==sum){
      System.out.print("It is an Armstrong ");
    }
    else{
        System.out.print("It is not an Armstrong ");

    }
    
    
  }
}
