import java.util.*;
import java.util.Stack;

class simplypath{
public String simplyPath(String path){
  Stack<String> s = new Stack<>();
  StringBuilder res = new StringBuilder();
  String[]p = path.split("/");
  for(int i=0;i<p.length;i++){
    if(!s.isEmpty() && p[i].equals(".."))
     s.pop();
    else if(!p[i].equals("") && !p[i].equals(".") && !p[i].equals(".."))
    s.push(p[i]);
    
  }
  if(s.isEmpty())return "/";
  while(!s.isEmpty()){
    res.insert(0,s.pop()) .insert(0,"/");
  }
  return res.toString();
}
public static void main(String []args){
 simplypath  sp = new simplypath(); 
        String path1 = "/home/";
        String path2 = "/../";
        String path3 = "/home//foo/";
        String path4 = "/a/./b/../../c/";
        System.out.println(sp.simplyPath( path1));
        System.out.println(sp.simplyPath( path2));
        System.out.println(sp.simplyPath( path3));
        System.out.println(sp.simplyPath( path4));

}
}