/*
Problem: Find nth Fibonacci Number
Topic: Recursion

Description:
Compute the nth Fibonacci number using recursion. 
The Fibonacci sequence is defined as:
F(0) = 0, F(1) = 1
F(n) = F(n-1) + F(n-2) for n > 1

Approach:
- Define a recursive function f(n)
- Base case: if n <= 1, return n
- Recursive case: return f(n-1) + f(n-2)

Time Complexity: O(2^n)   // exponential due to repeated calls
Space Complexity: O(n)    // recursion stack
*/


package recursion;

public class fibonacci {
    public static void main(String[] args) {
        int n=6;
        int ans=f(n);
        System.out.println(ans);
    }
    

static int f(int n)
{
    if(n<=1)
        return n;
    else
        return f(n-1)+f(n-2);
}
}