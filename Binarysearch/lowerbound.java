/*
Problem: Find Lower Bound and Upper Bound in a Sorted Array
Topic: Binary Search

Description:
Given a sorted array of integers and a target value x, find:
- Lower Bound: The first index where the element is greater than or equal to x (arr[i] >= x)
- Upper Bound: The first index where the element is strictly greater than x (arr[i] > x)

If such an index does not exist, return n (size of the array).

Example:
Input:
Array = [1, 2, 4, 4, 5, 7]
x = 4

Output:
Lower Bound Index = 2  (value = 4)
Upper Bound Index = 4  (value = 5)

Input:
x = 6

Output:
Lower Bound Index = 5  (value = 7)
Upper Bound Index = 5  (value = 7)

Input:
x = 8

Output:
Lower Bound Index = 6  (does not exist)
Upper Bound Index = 6  (does not exist)

Approach:
- Use Binary Search for efficient computation
- For Lower Bound:
  - If arr[mid] >= x → store index and move left
  - Else → move right
- For Upper Bound:
  - If arr[mid] > x → store index and move left
  - Else → move right
- Continue until search space is exhausted

Time Complexity: O(log n)
Space Complexity: O(1)
*/


package Binarysearch;
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
                high=mid;
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


