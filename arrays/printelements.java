package arrays;

import java.util.*;

import javax.print.attribute.IntegerSyntax;
public class printelements 
{
public static void main(String[] args)
 {
    Scanner scanner =new Scanner(System.in);
     int[] arr=new int[10];
    System.out.println("Enter 10 elements of the  array:+ ");
    for(int i=0;i<10;i++)
    {
     arr[i]=scanner.nextInt();
    }
    //System.out.println(" elements of the array are: ");
    int res=Integer.MIN_VALUE;
    int ans=Integer.MAX_VALUE;
for(int i=0;i<arr.length;i++)
{
 if(arr[i]>res)
 {
    res=arr[i];
 }
 if(arr[i]<ans)
    {
        ans=arr[i];

    }

 }

    System.out.println("MAXIMUM ELEMENT  is : " + res);
    System.out.println("MINIMUM ELEMENT  is : " + ans);
    scanner.close();
}
}

    


