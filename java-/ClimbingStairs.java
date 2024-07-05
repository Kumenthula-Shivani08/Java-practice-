import java.util.*;
import java.util.Stack;

class ClimbingStairs{
 public int ClimbStairs(int n) {
if(n==1){
return 1;
}
  int[] dp = new int[n+1];
  dp[1] = 1;
  dp[2] = 2;

  for(int i=3;i<=n;i++){
    dp[i] = dp[i-1] + dp[i-2];
  }
return dp[n];

}

 
public static void main(String []args){
  ClimbingStairs cs = new ClimbingStairs();
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of stairs: ");
  int n = sc.nextInt();
  System.out.println("Number of ways to climb "+n+ " stairs "+cs. ClimbStairs( n) );

}
}