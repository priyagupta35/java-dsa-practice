package arrays;
import java.util.*;
public class srqtbins {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("ENTER THE NUMBER :");
    int x=in.nextInt();

    int sqrd=findsqrt(x);
    System.out.println("SQUARE NROOT OF NUMBER " + x + "is:" + sqrd);
    in.close();
}    
static int findsqrt(int x)
{
    if(x==0 || x==1)
    {
        return x;
    }
    int left=1;
    int right=x;
    int result=1;
    while(left<=right)
    {
        int mid=left+(right-left)/2;
       long sqrd= (long) mid*mid;
         if(sqrd==x)
         {
            return mid;
         }
         else if(sqrd<x)
         {
            result=mid;
            left=mid+1;
         }
         else
         {
            right=mid-1;
         }
    }
    return result;
}
}
