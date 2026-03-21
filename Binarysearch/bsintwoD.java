/*
Problem: Search in a 2D Matrix
Topic: Binary Search

Description:
Given a 2D matrix where:
- Each row is sorted in ascending order
- The first element of each row is greater than the last element of the previous row

Find if a given target element exists in the matrix.

Return the position if found, otherwise indicate that it is not present.

Example:
Input:
Matrix = [
 [1, 3, 5],
 [7, 9, 11],
 [13, 15, 17]
]
Target = 9

Output:
Element found at position (1, 1)

Input:
Target = 4

Output:
Element not found

Approach:
- Treat the 2D matrix as a flattened sorted 1D array
- Apply Binary Search:
  - Start = 0
  - End = m*n - 1
- Calculate mid index
- Convert mid into 2D index:
  - row = mid / n
  - col = mid % n
- Compare:
  - If equal → return position
  - If smaller → search right
  - Else → search left

Time Complexity: O(log(m * n))
Space Complexity: O(1)
*/

package Binarysearch;
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
    System.out.println("Element not found");
    }
}