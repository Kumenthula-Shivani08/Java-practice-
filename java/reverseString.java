class reverseString{
  public static void main(String []args){
  char[] s ={'h','e','l','l','o'};
   char[] result = ReverseString( s);
   System.out.print("[");
   for(int i=0;i<result.length;i++){
       System.out.print("'"+result[i]+"'");
       if(i<result.length-1){
           System.out.print(",");

       }

   }
             System.out.print("]");

        // System.out.print(new String(result) );
  }
  public static char[] ReverseString(char[] s){
   int start=0;
   int end = s.length-1;
  
   while(start<end){
    char ch = s[start];
    s[start]=s[end];
    s[end]=ch ;
    start++;
    end--;
      }
      return s;
  }
}
