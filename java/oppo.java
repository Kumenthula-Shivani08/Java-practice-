class phone{
  public  void brand(){
    System.out.println("apple 13");
  }
  
}
class Nokia extends phone{
  public  void caption(){
   System.out.println("stay connected");
  }

}
class oppo extends Nokia{
  public void manifacture(){
  System.out.println("China piece");
  }
  public static void main(String [] args){
    oppo o = new oppo();
    o.brand();
    o.manifacture();
    o.caption();
    Nokia n = new Nokia();
  
  }
}
