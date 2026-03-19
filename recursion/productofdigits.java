/*
Problem: Product of Digits of a Number
Topic: Recursion

Description:
Calculate the product of all digits of a given number 
using recursion by extracting digits one by one.

Approach:
- Define a recursive function product(n)
- Base case: if n == 0, return 1
- Extract last digit using n % 10
- Multiply it with recursive call on remaining number (n / 10)

Time Complexity: O(n)   // n = number of digits
Space Complexity: O(n)  // recursion stack
*/

package recursion;

public class productofdigits {
    static int product(int n)
    {
        if(n==0)   // base case
            return 1;
        return  n%10*product(n/10);  //recursive call
    }
    
    public static void main(String[] args) {
        int n=1953;
        int ans=product(n);
            System.out.println(ans);
        
    }
}
