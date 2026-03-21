/*
Problem: Find Maximum and Minimum Element in an Array
Topic: Arrays

Description:
Given an array of integers, find the maximum and minimum elements.

Approach:
- Initialize max with Integer.MIN_VALUE
- Initialize min with Integer.MAX_VALUE
- Traverse the array
- Update max and min accordingly

Example:
Input: [3, 7, 1, 9, 4]
Output:
Maximum = 9
Minimum = 1

Time Complexity: O(n)
Space Complexity: O(1)
*/
    
package arrays;

import java.util.*;
public class Printlements 
{
public static void main(String[] args)
 {
    Scanner scanner =new Scanner(System.in);
    System.out.println("ENTER THE NUMBER OF ELEMENTS:");
    int n =scanner.nextInt();
     int[] arr=new int[10];
    System.out.println("Enter " + n + " elements :");
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

    


