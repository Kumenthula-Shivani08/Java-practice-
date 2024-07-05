class BuyStock{
  public static void main(String [] args){
//  int prices[] =new int[]{7,1,5,3,6,4};
 int prices[] =new int[]{1,2,3,4,5};
System.out.println(maxProfit( prices));
  }
 public static int maxProfit(int[] prices){
  int  profit = 0;
 int  n=prices.length;
  for(int i=1;i<n;i++){
    if(prices[i]>prices[i-1]){
    profit = profit +(prices[i]-prices[i-1]);
  }
  }
  return profit;
  }
}