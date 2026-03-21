/*
Problem: Find Floor and Ceil in a Sorted Array
Topic: Binary Search

Description:
Given a sorted array of integers and a target value, find:
- Floor: The greatest element in the array that is less than or equal to the target
- Ceil: The smallest element in the array that is greater than or equal to the target

If floor or ceil does not exist, return -1.

Example:
Input:
Array = [2, 4, 6, 8]
Target = 5

Output:
Floor = 4
Ceil = 6

Input:
Target = 1
Output:
Floor = -1
Ceil = 2

Input:
Target = 10
Output:
Floor = 8
Ceil = -1

Approach:
- Use Binary Search to efficiently find floor and ceil
- For Ceil:
  - If arr[mid] >= target → store it and move left
  - Else → move right
- For Floor:
  - If arr[mid] <= target → store it and move right
  - Else → move left
- Continue until search space is exhausted

Time Complexity: O(log n)
Space Complexity: O(1)
*/

package Binarysearch;
import java.util.*;

public class floorceil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("ENTER THE ELEMENTS OF THE ARRAY:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("ENTER THE TARGET:");
        int tar = in.nextInt();

        //  CEIL (smallest >= target)
        int start = 0, end = n - 1;
        int ceil = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= tar) {
                ceil = arr[mid];
                end = mid - 1;   // move left
            } else {
                start = mid + 1;
            }
        }

        //  FLOOR (largest <= target)
        start = 0;
        end = n - 1;
        int floor = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= tar) {
                floor = arr[mid];
                start = mid + 1;   // move right
            } else {
                end = mid - 1;
            }
        }

        System.out.println("CEIL VALUE: " + ceil);
        System.out.println("FLOOR VALUE: " + floor);

        in.close();
    }
}