class ValidPalindrome{
    public static void main(String[] args) {
   String s = "A manq, a plan, a canal: Panama";
System.out.println(ValidPalindrome(s));
    
}
public static boolean ValidPalindrome(String s){
  s =s.toLowerCase().replaceAll("[^a-z0-9]","");
  int i=0;
  int j=s.length()-1;
  
  while(i<j){
    if(s.charAt(i)!=s.charAt(j)){
      return false;
    }
    i++;
    j--;
  }
  return true;
}
}