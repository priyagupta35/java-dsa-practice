/*
Problem: Find Square Root using Binary Search
Topic: Binary Search

Description:
Given a non-negative integer x, find the integer square root of x.
The result should be the floor value (i.e., the greatest integer such that square <= x).

Example:
Input: x = 8
Output: 2

Input: x = 16
Output: 4

Approach:
- Use Binary Search between 1 and x
- Calculate mid and compare mid * mid with x
- If equal → return mid
- If mid * mid < x → move right and store result
- Else → move left

Time Complexity: O(log n)
Space Complexity: O(1)
*/


package arrays;
import java.util.*;
public class SquareRootBinarysearch {
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
