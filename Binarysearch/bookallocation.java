/*
Problem: Book Allocation Problem
Topic: Binary Search

Description:
Given an array where each element represents the number of pages in a book and an integer m (number of students),
allocate books to students such that:
- Each student gets at least one book
- Books are allocated in contiguous order
- The maximum number of pages assigned to a student is minimized

If allocation is not possible (i.e., number of students > number of books), return -1.

Example:
Input:
Books = [10, 20, 30, 40]
Students = 2

Output:
60

Explanation:
- Possible allocations:
  [10, 20, 30] and [40] → max = 60
  [10, 20] and [30, 40] → max = 70
- Minimum of maximum pages = 60

Approach:
- Use Binary Search on the answer (maximum pages)
- Search space:
  - Start = 0
  - End = sum of all pages
- For each mid (possible answer), check feasibility using isvalid():
  - Allocate books greedily to students
  - If required students > m → not valid
- If valid → store answer and search left (minimize further)
- Else → search right

Time Complexity: O(n log(sum of pages))
Space Complexity: O(1)
*/



package Binarysearch;
import java.util.*;
public class bookallocation
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF BOOKS:");
        int n=in.nextInt();
        int arr[]=new int[n];
         System.out.println("ENTER THE NUMBER OF PAGES OF THE BOOK:");
         for(int i=0;i<n;i++)
         {
            arr[i]=in.nextInt();
         }

         System.out.println("ENTER THE NUMBER OF STUDENTS:");
          int m=in.nextInt();
         int result=allocatebook(arr,m,n);
         System.out.println("MIN POSSIBLE MAX PAGES:" + result);
         in.close();
    }

    static int allocatebook(int[] arr, int m, int n) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'allocatebook'");
       if(m>n)
       {
        return -1;
       }
    int sum=0;//int st=0,end=sum,ans=-1;
    for(int i=0;i<n;i++)
    {
        sum+=arr[i];
    }
    int st=0,end=sum,ans=-1;
    while(st<=end)
    {
       int mid=st+(end-st)/2;
     if(isvalid(arr,m,n,mid))
       {
        ans=mid;
        end=mid-1;
       }
      else
      {
        st=mid+1;
         }
    }

      return ans;
    }
static boolean isvalid(int arr[],int m,int n,int mid)
      {
        // TODO Auto-generated method stub
        //  throw new UnsupportedOperationException("Unimplemented method 'isvalid'");

        int st=1,pages=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>mid)
            {
                return false;
            }
                if(pages+arr[i]<=mid)
                {
                    pages+=arr[i];
                }
                else
                {
                    st++;
                    pages=arr[i];
                
                    
                if (st > m) 
                {
                    return false;
                }
                }
        }
        return true;
    }
}
