

/*
Problem: Print Numbers Using Recursion
Topic: Recursion

Description:
Print numbers from n to 1 using recursion. 
Demonstrates how recursive function calls work 
and how parameters change during each call.

Approach:
- Define a recursive function that takes an integer n
- Base case: if n == 0, stop recursion
- Print current value of n
- Make recursive call with n-1 (using pre-decrement)

Time Complexity: O(n)
Space Complexity: O(n)  // due to recursion stack
*/

package recursion;

public class concept {
    static void conceptpass(int n)
    {
        if(n==0)  //base case
        return;
    System.out.println(n);
    conceptpass(--n);  //recursive call

    }
    public static void main(String[] args) {
        int n=5;
        conceptpass(n);
    }
    
}
