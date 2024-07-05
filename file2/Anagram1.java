import java.util.*;
class Anagram1{
  public static void main(String[]args){
    String s = "anagram";
    String t = "nagaram";
    boolean result =  ValidAnagram(s, t);
    System.out.println(result);
  }
  public static boolean ValidAnagram(String s,String t){
    int n = s.length();
    int m = t.length();

    if(m!=n){
      return false;
    }
    else{
      int count[] = new int[26];
      for(int i=0;i<n;i++){
        count[s.charAt(i)-'a']++;
      }
      for(int i=0;i<m;i++){
        count[s.charAt(i)-'a']--;
      }
      for(int i=0;i<count.length;i++){
        if(count[i]!=0){
          return false;
        }

      }
      return true;
    }

  }
}