/*
Problem: Search Insert Position
Topic: Binary Search

Description:
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If the target is not found, return the index where it would be inserted to maintain sorted order.

Example:
Input:
Array = [1, 3, 5, 6]
Target = 5

Output:
2

Input:
Target = 2

Output:
1

Input:
Target = 7

Output:
4

Approach:
- Use Binary Search to efficiently find the position
- Initialize:
  - start = 0
  - end = n - 1
- While start <= end:
  - Calculate mid
  - If nums[mid] == target → return mid
  - If nums[mid] < target → move right (start = mid + 1)
  - Else → move left (end = mid - 1)
- If target is not found, return start
  (start will point to the correct insert position)

Time Complexity: O(log n)
Space Complexity: O(1)
*/



package Binarysearch;
  import java.util.*;
  public class searchinsert {
  public static void main(String[] args) {
      
    Scanner in=new Scanner(System.in);
    System.out.println("ENTER THE SIZE EOF THE ARRAY:");
    int n=in.nextInt();
    int [] nums=new int[n];
    int start=0;
    int end=n-1;
    System.out.println("ENTER THE ELEMENTS OF THE ARRAY:");
    for(int i=0;i<n;i++)
    {
      nums[i]=in.nextInt();
    }
    System.out.println("ENTER THE TARGET:");
    int tar=in.nextInt();

  // int start=0;
    //nt end=n-1;
   // int tarindex=n;
    while(start<=end)
    {
      int mid=start+(end-start)/2;
      System.out.println("Middle element:" +  mid);
      

      if(tar==nums[mid])  //target==mid value
      {
          tar=mid;
          break;
          //System.out.println("index of the target element:"+ mid);
      }
      else if(tar>nums[mid])  // search in rightside
      {
        start=mid+1;
        
      }
      else // search in left side 
      {
          end=mid-1;
          
      }
  }
      if(tar==n)
      {
          tar=start;
          System.out.println("Target index should be inserted at index:"+ tar);
      }
      //System.out.println("Index of the target element:"+ nums[tarindex]);
    
    in.close();

  }
  }

