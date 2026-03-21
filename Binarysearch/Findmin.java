/*
Problem: Find Minimum in Rotated Sorted Array
Topic: Binary Search

Description:
Given a rotated sorted array (with distinct elements), find the minimum element in the array.

A rotated array is an array that was originally sorted in ascending order but then rotated at some pivot point.

Example:
Input:
Array = [4, 5, 6, 7, 0, 1, 2]

Output:
0

Input:
Array = [3, 4, 5, 1, 2]

Output:
1

Approach:
- Use Binary Search to reduce time complexity
- Initialize:
  - low = 0
  - high = n - 1
  - ans = Integer.MAX_VALUE
- Check if left part is sorted:
  - If arr[low] <= arr[mid]:
    → Minimum lies in left part
    → Update ans with arr[low]
    → Move to right half (low = mid + 1)
- Else:
    → Minimum lies in right part
    → Update ans with arr[mid]
    → Move to left half (high = mid - 1)
- Continue until low > high

Time Complexity: O(log n)
Space Complexity: O(1)
*/

package Binarysearch;
import java.util.*;

public class Findmin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        int n = in.nextInt();

        if (n == 0) {
            System.out.println("Array is empty");
            return;
        }

        int[] arr = new int[n];

        System.out.println("ENTER THE ARRAY ELEMENTS: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int minimum = findmini(arr);
        System.out.println("THE MINIMUM ELEMENT IS: " + minimum);

        in.close();
    }

    public static int findmini(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            // Minimum lies in right half
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            }
            // Minimum lies in left half (including mid)
            else {
                high = mid;
            }
        }

        return arr[low];
    }
}
