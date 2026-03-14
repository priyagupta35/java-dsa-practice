package arrays.arrays.binarysearch;
import java.util.*;
 public class bsintwoD
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the  size of the matrix :");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [][]arr=new int[m][n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the target:");
        int target=sc.nextInt();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==target)
                {
                    System.out.println("ans found at"  +arr[i][j]);
                }
            }
        }
     System.out.println("Ans not found"  +arr[-1][-1]);
    }
}