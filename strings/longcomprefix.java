package strings;
import java.util.*;

public class longcomprefix {
    private static final String[] fly = null;

    public String longestcommonprefix(String[] str)
    {
        if(str==null|| str.length==0)
        {
            return " ";       //retuen empty string 
         }
         Arrays.sort(str);  // sorts the array in squence
         String first=str[0];
         String last=str[str.length-1];
         
         int i=0;
         while(i<first.length() && i<last.length()  &&  first.charAt(i)==last.charAt(i))
         {
            i++;
      
         }
         return first.substring(0,i);
    
     }

     public static void main(String[] args) {
        longcomprefix obj=new longcomprefix();
     
        String[] s={"fly","man","oam"};
        String result=obj.longestcommonprefix(s);
        System.out.println("longest common prefix :" +result);
     }
    }
