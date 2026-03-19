/*
Problem: Find Factorial of a Number
Topic: Recursion

Description:
Calculate the factorial of a given number using recursion. 
Factorial of a number n is defined as:
n! = n × (n-1) × (n-2) × ... × 1

Approach:
- Define a recursive function fact(n)
- Base case: if n == 0 or n == 1, return 1
- Recursive case: return n * fact(n-1)

Time Complexity: O(n)
Space Complexity: O(n)  // recursion stack
*/

package recursion;

public class factorial {
    static int  fact(int n)
    {
        if(n==0 || n==1)  //base case
            return 1;
     
        return n*fact(n-1);  // recursive call
}   
            public static void main(String[] args) {
                int n=3;
                int result=fact(n);
                    System.out.print(result);
                
            }
        }

