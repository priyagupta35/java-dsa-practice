package strings;
import java.util.*;
public class stringrotation {
    public boolean rotatedString(String s,String goal)
    {
        if(s.length()!=goal.length()) //checks if it is of equal length 
        {
            return false;
        }

        for(int i=0;i<s.length();i++) //traversal
        {
            String rotated=s.substring(i)+s.substring(0,i);  //s+s method 
            if(rotated.equals(goal))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        stringrotation obj=new stringrotation();
        //String s="abcde";
        //St//ring goal="cdeanb";
        System.out.println(obj.rotatedString("abcde", "cde"));
        System.out.println(obj.rotatedString("123abd","abd123"));

    }
    
}
