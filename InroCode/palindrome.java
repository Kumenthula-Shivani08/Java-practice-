import java.util.*;
public class palindrome{
public static void main(String [] args){
int num=123 ,reverse=0,rem,temp;
temp = num; 

while(temp!=0){
  rem=temp%10;
  reverse=reverse*10+rem;
  temp/=10;

};
if(num ==reverse){
   System.out.print(num+" is a palindrom");
}
else{
     System.out.print(num+" is not a palindrom");

}
}
}