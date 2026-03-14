package arrays.arrays.binarysearch;
import java.util.*;
public class lowerbound
 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        int n=in.nextInt();
        int [] arr=new int[n];
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY:");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("ENTER THE TARGET:");
        int x=in.nextInt();
        int low=0,high=n-1;
        int lowerbound=n;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>=x)
            {
                lowerbound=mid;
                high=mid-1; //looking for the smallest index on left side 
            }
            else{
                low=mid+1;  //looking for thr smallest index on right side
            }
        }
         low=0;
         high=n-1;
        int higherbound=n;
         while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>x)
            {
                higherbound=mid+1;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
         if (lowerbound == n) 
         {
            System.out.println("No element is >= " + x + " (lower bound does not exist)");
        } 
        else 
        {
            System.out.println("Lower bound of " + x + " is at index: " + lowerbound + ", value: " + arr[lowerbound]);
        }
            if(higherbound==n)
            {
                System.out.println("No element is > " + x + " (higher bound does not exist)");
            }
            else
            {
                 System.out.println("higher bound of " + x + " is at index: " + higherbound + ", value: " + arr[higherbound]);
            }// return ans;
    
    in.close();
    }
}


