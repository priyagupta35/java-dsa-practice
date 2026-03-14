package strings;
import java.util.*;
public class largestoddnum {

    public String largestoddNum(String s)
    {
        int ind=-1;
int i;
for( i=s.length()-1;i>=0;i--)
{
    if((s.charAt(i)-'0')%2==1)
    {
        ind=i;
        break;
    }
}
 if(ind==-1)
 {
    return " ";
 }
 i=0;
 while(i<=ind && s.charAt(i)=='0')
 {
    i++;
 }
 return s.substring(i, ind+1);
}

public static void main(String[] args) {
    largestoddnum obj=new largestoddnum();
    String num="5678";
    String result=obj.largestoddNum(num);
    System.out.println("largest odd number:" + result);
    //obj.largestoddNum
}
}
