import java.util.*;
public class leapyear{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int leapyear = sc.nextInt();
    if(leapyear % 400==0 ){
        System.out.print(leapyear+" is a leapyear ");
    }
    else if(leapyear%4==0 && leapyear % 100!=0){
         System.out.print(leapyear+" is a leapyear ");

    }
    else{
      System.out.print(leapyear+" is not a leapyear ");

    }
  }
}
