import java.util.*;
public class sumdigit{
public static void main(String [] args){
int sum=0,num=12345;
while(num !=0){
 sum+=num%10;
 num/=10;

}
 System.out.print(sum);
 
    }
}