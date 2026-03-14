package strings;
import java.util.*;
public class isPallindrome
{
public static void main(String[] args) 
{
    String str=" abcvcba";
    System.out.println(isPallindrome(str));
}

    static boolean isPallindrome(String str)
{

str=str.toLowerCase();
if(str==null || str.length()==0)
{
    return true;
}
for(int i=0;i<str.length()/2;i++)
{
    char start=str.charAt(i);
    char end=str.charAt(str.length()-1-i);
    if(start!=end)
    {
    return false;
    }   
}
return true;
}
}

    