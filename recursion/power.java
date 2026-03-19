/*
Problem: Calculate Power (x^n) using Recursion
Topic: Recursion

Description:
Compute the power of a number x raised to n (x^n) 
using recursion by multiplying x repeatedly.

Approach:
- Define a recursive function mypow(x, n)
- Base case: if n == 0, return 1
- Recursive case: return x * mypow(x, n-1)

Time Complexity: O(n)
Space Complexity: O(n)  // recursion stack
*/


package recursion;

public class power {
     static double mypow(double x,int n)
    {
        if( n==0) // base case
            return 1;
        return x*mypow(x, n-1);  //recursive call
    }  
    public static void main(String[] args) {
        int p=4;
        double x=2.000;
        double ans=mypow(x,p);
        System.out.print(ans);
    }
    
}
