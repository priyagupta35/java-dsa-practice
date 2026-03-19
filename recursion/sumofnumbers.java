/*
Problem: Sum of First N Natural Numbers
Topic: Recursion

Description:
Calculate the sum of first n natural numbers using recursion.
The sum is defined as:
1 + 2 + 3 + ... + n

Approach:
- Define a recursive function sum(n)
- Base case: if n == 0, return 0
- Recursive case: return n + sum(n-1)

Time Complexity: O(n)
Space Complexity: O(n)  // recursion stack
*/

package recursion;

public class sumofnumbers {
    static int  sum(int n)
    {
        if(n==0)  //base caae
            return 0;
        return n+sum(n-1);  // recursive call
        
    }

    public static void main(String[] args) {
        int n=3;
        int result=sum(n);
        System.out.println(result);
    }
}
