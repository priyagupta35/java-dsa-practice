
/*
Problem: Print Numbers from n to 1 using Recursion
Topic: Recursion

Description:
Print numbers in decreasing order from n to 1 
using recursion. Demonstrates how the position 
of recursive calls affects the output order.

Approach:
- Define a recursive function print(n)
- Base case: if n == 0, stop recursion
- Print current value of n
- Make recursive call with n-1

Time Complexity: O(n)
Space Complexity: O(n)  // recursion stack
*/
package recursion;
public class numberprint {
static void print(int n)
{
    if(n==0)   //base case
        return;
   // print(n-1);   // recursive call
    System.out.println(n);
     print(n-1);   // recursive call

}

    public static void main(String[] args) {
        int n=7;
        print(n);
    
}
}
